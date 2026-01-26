import java.io.*;

public class ImageByteArrayCopy {

    public static void main(String[] args) {

        File inputImage = new File("input.jpg");
        File outputImage = new File("output.jpg");

        try (FileInputStream fis = new FileInputStream(inputImage);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            // Read image into ByteArrayOutputStream
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            // Write byte array back to image file
            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                 FileOutputStream fos = new FileOutputStream(outputImage)) {

                while ((bytesRead = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }

            // Verify both files are identical
            boolean identical = inputImage.length() == outputImage.length();
            System.out.println("Files are identical: " + identical);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

