public class NumberChecker {
    public static int countDigits(int num) {
        return Integer.toString(num).length();
    }

    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0)
                return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    public static int[] findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[] { largest, secondLargest };
    }

    public static int[] findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[] { smallest, secondSmallest };
    }

    public static void main(String[] args) {
        int num = 153;

        int[] digits = storeDigits(num);
        System.out.println("Number of digits: " + countDigits(num));
        System.out.println("Is Duck number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong number? " + isArmstrong(num, digits));
        int[] largest = findLargest(digits);
        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second largest digit: " + largest[1]);
        int[] smallest = findSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second smallest digit: " + smallest[1]);
    }
}
