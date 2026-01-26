import java.io.*;

public class FileCopyComparison {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {

        File source = new File("source.txt");
        File unbufferedDest = new File("unbuffered_copy.txt");
        File bufferedDest = new File("buffered_copy.txt");

        if (!source.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        // Unbuffered copy
        long startUnbuffered = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(unbufferedDest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long endUnbuffered = System.nanoTime();

        // Buffered copy
        long startBuffered = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(bufferedDest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long endBuffered = System.nanoTime();

        System.out.println("Unbuffered copy time (ns): " + (endUnbuffered - startUnbuffered));
        System.out.println("Buffered copy time (ns): " + (endBuffered - startBuffered));
    }
}

