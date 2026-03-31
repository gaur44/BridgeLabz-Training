import java.io.*;

public class FileRead {

    public static void main(String[] args) throws Exception {

        String filePath = "file.txt";

        // Using FileReader
        long start = System.currentTimeMillis();
        FileReader fr = new FileReader(filePath);
        BufferedReader br1 = new BufferedReader(fr);

        while (br1.readLine() != null) {
            // read line
        }
        br1.close();

        long end = System.currentTimeMillis();
        System.out.println("FileReader time: " + (end - start) + " ms");

        // Using InputStreamReader
        start = System.currentTimeMillis();
        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(filePath));
        BufferedReader br2 = new BufferedReader(isr);

        while (br2.readLine() != null) {
            // read line
        }
        br2.close();

        end = System.currentTimeMillis();
        System.out.println("InputStreamReader time: " + (end - start) + " ms");
    }
}

