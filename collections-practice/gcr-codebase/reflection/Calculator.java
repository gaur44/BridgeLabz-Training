import java.lang.reflect.Method;

public class Calculator {

    private int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        try {
            Calculator c = new Calculator();

            Class<?> cls = c.getClass();

            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            method.setAccessible(true);

            int result = (int) method.invoke(c, 4, 5);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

