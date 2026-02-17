package addressbook;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AddressBookIO {

    private static final String SEP = "|";
    private static ExecutorService executor = Executors.newCachedThreadPool();

    public void writeToFile(AddressBook book, String path) throws IOException {
        try (BufferedWriter w = Files.newBufferedWriter(Path.of(path))) {
            for (Contact c : book.getContacts()) {
                w.write(c.getFirstName() + SEP + c.getLastName() + SEP + c.getAddress() + SEP
                        + c.getCity() + SEP + c.getState() + SEP + c.getZip() + SEP
                        + c.getPhoneNumber() + SEP + c.getEmail());
                w.newLine();
            }
        }
    }

    public List<Contact> readFromFile(String path) throws IOException {
        List<Contact> list = new ArrayList<>();
        if (!Files.exists(Path.of(path))) return list;
        try (BufferedReader r = Files.newBufferedReader(Path.of(path))) {
            String line;
            while ((line = r.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] p = line.split("\\" + SEP, -1);
                if (p.length >= 8)
                    list.add(new Contact(p[0].trim(), p[1].trim(), p[2].trim(), p[3].trim(), p[4].trim(), p[5].trim(), p[6].trim(), p[7].trim()));
            }
        }
        return list;
    }

    public void writeToCSV(AddressBook book, String path) throws Exception {
        try (Writer w = Files.newBufferedWriter(Path.of(path)); CSVWriter csv = new CSVWriter(w)) {
            csv.writeNext(new String[]{"firstName", "lastName", "address", "city", "state", "zip", "phone", "email"});
            for (Contact c : book.getContacts())
                csv.writeNext(new String[]{c.getFirstName(), c.getLastName(), c.getAddress(), c.getCity(), c.getState(), c.getZip(), c.getPhoneNumber(), c.getEmail()});
        }
    }

    public List<Contact> readFromCSV(String path) throws Exception {
        List<Contact> list = new ArrayList<>();
        if (!Files.exists(Path.of(path))) return list;
        try (Reader r = Files.newBufferedReader(Path.of(path)); CSVReader csv = new CSVReader(r)) {
            List<String[]> rows = csv.readAll();
            for (int i = 0; i < rows.size(); i++) {
                if (i == 0 && rows.get(0)[0].equals("firstName")) continue; // skip header
                String[] row = rows.get(i);
                if (row.length >= 8)
                    list.add(new Contact(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7]));
            }
        }
        return list;
    }

    public void writeToJSON(AddressBook book, String path) throws IOException {
        Gson gson = new Gson();
        Files.writeString(Path.of(path), gson.toJson(book.getContacts()));
    }

    public List<Contact> readFromJSON(String path) throws IOException {
        if (!Files.exists(Path.of(path))) return new ArrayList<>();
        String s = Files.readString(Path.of(path));
        Type type = new TypeToken<ArrayList<Contact>>() {}.getType();
        List<Contact> list = new Gson().fromJson(s, type);
        return list != null ? list : new ArrayList<>();
    }

    public void writeToServer(AddressBook book, String baseUrl, String resource) {
        String url = baseUrl.endsWith("/") ? baseUrl + resource : baseUrl + "/" + resource;
        for (Contact c : book.getContacts()) {
            String json = new Gson().toJson(c);
            RestAssured.given().contentType(ContentType.JSON).body(json).post(url);
        }
    }

    public List<Contact> readFromServer(String baseUrl, String resource) {
        String url = baseUrl.endsWith("/") ? baseUrl + resource : baseUrl + "/" + resource;
        String body = RestAssured.given().get(url).body().asString();
        Type type = new TypeToken<ArrayList<Contact>>() {}.getType();
        List<Contact> list = new Gson().fromJson(body, type);
        return list != null ? list : new ArrayList<>();
    }

    public Future<?> writeToFileAsync(AddressBook book, String path) {
        return executor.submit(() -> { try { writeToFile(book, path); } catch (IOException e) { throw new RuntimeException(e); } });
    }

    public Future<List<Contact>> readFromFileAsync(String path) {
        return executor.submit(() -> { try { return readFromFile(path); } catch (IOException e) { throw new RuntimeException(e); } });
    }

    public Future<?> writeToCSVAsync(AddressBook book, String path) {
        return executor.submit(() -> { try { writeToCSV(book, path); } catch (Exception e) { throw new RuntimeException(e); } });
    }

    public Future<List<Contact>> readFromCSVAsync(String path) {
        return executor.submit(() -> { try { return readFromCSV(path); } catch (Exception e) { throw new RuntimeException(e); } });
    }

    public Future<?> writeToJSONAsync(AddressBook book, String path) {
        return executor.submit(() -> { try { writeToJSON(book, path); } catch (IOException e) { throw new RuntimeException(e); } });
    }

    public Future<List<Contact>> readFromJSONAsync(String path) {
        return executor.submit(() -> { try { return readFromJSON(path); } catch (IOException e) { throw new RuntimeException(e); } });
    }

    public Future<?> writeToServerAsync(AddressBook book, String baseUrl, String resource) {
        return executor.submit(() -> writeToServer(book, baseUrl, resource));
    }

    public Future<List<Contact>> readFromServerAsync(String baseUrl, String resource) {
        return executor.submit(() -> readFromServer(baseUrl, resource));
    }

    public void writeToDB(AddressBook book, String jdbcUrl) throws SQLException {
        try (Connection conn = DriverManager.getConnection(jdbcUrl); Statement st = conn.createStatement()) {
            st.execute("CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT, first_name TEXT, last_name TEXT, address TEXT, city TEXT, state TEXT, zip TEXT, phone_number TEXT, email TEXT)");
            st.execute("DELETE FROM contacts");
        }
        String insert = "INSERT INTO contacts (first_name, last_name, address, city, state, zip, phone_number, email) VALUES (?,?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(jdbcUrl); PreparedStatement ps = conn.prepareStatement(insert)) {
            for (Contact c : book.getContacts()) {
                ps.setString(1, c.getFirstName()); ps.setString(2, c.getLastName()); ps.setString(3, c.getAddress());
                ps.setString(4, c.getCity()); ps.setString(5, c.getState()); ps.setString(6, c.getZip());
                ps.setString(7, c.getPhoneNumber()); ps.setString(8, c.getEmail());
                ps.executeUpdate();
            }
        }
    }

    public List<Contact> readFromDB(String jdbcUrl) throws SQLException {
        List<Contact> list = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(jdbcUrl); Statement st = conn.createStatement()) {
            st.execute("CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT, first_name TEXT, last_name TEXT, address TEXT, city TEXT, state TEXT, zip TEXT, phone_number TEXT, email TEXT)");
        }
        try (Connection conn = DriverManager.getConnection(jdbcUrl); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery("SELECT first_name, last_name, address, city, state, zip, phone_number, email FROM contacts")) {
            while (rs.next())
                list.add(new Contact(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
        }
        return list;
    }
}
