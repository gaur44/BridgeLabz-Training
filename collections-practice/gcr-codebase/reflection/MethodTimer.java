import java.lang.reflect.Method;

class MathOps {

    public void addNumbers(int a, int b) {
        int sum = 0;
        for (int i = 0; i < 1_000_000; i++) sum += a + b;
    }

    public void multiplyNumbers(int a, int b) {
        int prod = 1;
        for (int i = 0; i < 1_000_000; i++) prod = a * b;
    }
}

public class MethodTimer {

    public static void main(String[] args) {

        MathOps obj = new MathOps();

        try {
            Method[] methods = MathOps.class.getDeclaredMethods();

            for (Method m : methods) {
                long start = System.nanoTime();

                m.invoke(obj, 5, 10);
                long end = System.nanoTime();
                System.out.println(m.getName() + " executed in " + (end - start) + " ns");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

