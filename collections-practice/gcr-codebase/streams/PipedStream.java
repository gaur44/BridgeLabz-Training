Bimport java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStream {

    public static void main(String[] args) {

        try {
            PipedInputStream pis = new PipedInputStream();
            PipedOutputStream pos = new PipedOutputStream(pis);

            // Writer thread
            Thread writer = new Thread(() -> {
                try {
                    String message = "Hello from writer thread";
                    pos.write(message.getBytes());
                    pos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Reader thread
            Thread reader = new Thread(() -> {
                try {
                    int data;
                    while ((data = pis.read()) != -1) {
                        System.out.print((char) data);
                    }
                    pis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.start();
            reader.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

