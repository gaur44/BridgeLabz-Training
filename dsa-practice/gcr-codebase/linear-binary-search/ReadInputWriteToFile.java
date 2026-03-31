import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadInputWriteToFile {

    public static void main(String[] args) {
        String fileName = "output.txt";

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileWriter fileWriter = new FileWriter(fileName);

            String input;
            while (true) {
                input = bufferedReader.readLine();
                if (input.equals("exit")) {
                    break;
                }
                fileWriter.write(input + System.lineSeparator());
            }

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
