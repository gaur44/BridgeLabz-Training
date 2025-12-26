public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10, x = 0, y = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(x + " ");
            int sum = x + y;
            x = y;
            y = sum;
        }
    }
}