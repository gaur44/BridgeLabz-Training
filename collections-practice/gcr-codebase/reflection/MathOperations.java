import java.lang.reflect.Method;
import java.util.Scanner;

public class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            MathOperations obj = new MathOperations();

            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = sc.nextLine();

            System.out.print("Enter first number: ");
            int x = sc.nextInt();

            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            // Get Class object
            Class<?> cls = obj.getClass();

            // Get method dynamically
            Method method = cls.getMethod(methodName, int.class, int.class);

            // Invoke method
            int result = (int) method.invoke(obj, x, y);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Invalid method name or error occurred");
        }

        sc.close();
    }
}

