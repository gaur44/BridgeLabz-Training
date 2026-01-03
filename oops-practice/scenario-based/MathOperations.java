public class MathOperations {
    public static void main(String[] args) {
        System.out.println(MathOperationUtility.findFactorial(5));
        System.out.println(MathOperationUtility.findFactorial(0));

        System.out.println(MathOperationUtility.isPrime(11));
        System.out.println(MathOperationUtility.isPrime(4));

        System.out.println(MathOperationUtility.findGCD(24, 36));

        System.out.println(MathOperationUtility.fibonacci(7));
    }
}

class MathOperationUtility {
    static int findFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int findGCD(int a, int b) {
        if (a == 0) {
            return b;
        }

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int f1 = 0, f2 = 1, f3 = 0;
        for (int i = 2; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
