import java.io.*;

public class FileReaderVsInputStreamReader {

    public static void main(String[] args) {
        String fileName = "largefile.txt";

        // FileReader
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            long start = System.nanoTime();
            int wordCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            long end = System.nanoTime();
            System.out.println("FileReader word count: " + wordCount);
            System.out.println("FileReader time: " + (end - start)/1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error with FileReader: " + e.getMessage());
        }

        // InputStreamReader
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            long start = System.nanoTime();
            int wordCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            long end = System.nanoTime();
            System.out.println("InputStreamReader word count: " + wordCount);
            System.out.println("InputStreamReader time: " + (end - start)/1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error with InputStreamReader: " + e.getMessage());
        }
    }
}
