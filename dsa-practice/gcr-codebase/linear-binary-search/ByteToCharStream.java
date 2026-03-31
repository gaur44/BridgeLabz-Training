import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteToCharStream {

    public static void main(String[] args) {
        String fileName = "file.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            InputStreamReader inputStreamReader =
                    new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
