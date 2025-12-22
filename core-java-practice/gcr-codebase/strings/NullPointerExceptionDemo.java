public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String text = null;

        // Handling the exception.
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught Null Pointer Exception with Message: " + e.getMessage());
        }
    }
}