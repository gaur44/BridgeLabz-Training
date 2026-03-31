import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;
        int[] count = new int[range];

        for (int age : ages) {
            count[age - minAge]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Build output array
        int[] output = new int[ages.length];

        // Traverse from right to left to keep stability
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int pos = count[age - minAge] - 1;

            output[pos] = age;
            count[age - minAge]--;
        }

        // Copy back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] studentAges = { 12, 15, 10, 18, 14, 12, 16, 11 };

        System.out.println("Before Sorting: " + Arrays.toString(studentAges));

        countingSort(studentAges);

        System.out.println("After Sorting: " + Arrays.toString(studentAges));
    }
}
