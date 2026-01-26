import java.io.*;

public class StudentDataStream {

    public static void main(String[] args) {

        String filename = "student.dat";

        // Write primitive data
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(filename))) {

            dos.writeInt(101);              
            dos.writeUTF("Alice");          
            dos.writeDouble(3.8);           

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read primitive data
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(filename))) {

            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println(roll);
            System.out.println(name);
            System.out.println(gpa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

