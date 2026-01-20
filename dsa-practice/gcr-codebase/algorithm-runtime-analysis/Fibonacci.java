public class FibonacciTest {

    // Recursive approach
    static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative approach
    static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        
        int n = 30;

        long start, end;

        // Recursive
        start = System.currentTimeMillis();
        int r1 = fibonacciRecursive(n);
        end = System.currentTimeMillis();
        System.out.println("Recursive Fibonacci(" + n + ") = " + r1);
        System.out.println("Recursive time: " + (end - start) + " ms");

        // Iterative
        start = System.currentTimeMillis();
        int r2 = fibonacciIterative(n);
        end = System.currentTimeMillis();
        System.out.println("Iterative Fibonacci(" + n + ") = " + r2);
        System.out.println("Iterative time: " + (end - start) + " ms");
    }
}

