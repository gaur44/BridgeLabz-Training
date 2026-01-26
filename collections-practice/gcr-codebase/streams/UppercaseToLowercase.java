import java.io.*;

public class UppercaseToLowercase {

    public static void main(String[] args) {

        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (
            InputStreamReader isr = new InputStreamReader(new FileInputStream(inputFile), "UTF-8");
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            BufferedWriter bw = new BufferedWriter(osw)
        ) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
:
