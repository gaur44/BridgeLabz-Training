import java.util.Arrays;
import java.util.Random;

public class SearchComparison {

    // Linear Search: O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search: O(log N)
    // Precondition: sorted array: arr
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    // Generate dataset
    public static int[] generateData(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10_000, 1_000_000};
        int target = -1;

        for (int size : datasetSizes) {
            int[] data = generateData(size);

            // Linear Search timing
            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long endLinear = System.nanoTime();

            // Sort before Binary Search
            Arrays.sort(data);

            // Binary Search timing
            long startBinary = System.nanoTime();
            binarySearch(data, target);
            long endBinary = System.nanoTime();

            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " +
                    (endLinear - startLinear) / 1_000_000.0 + " ms");
            System.out.println("Binary Search Time: " +
                    (endBinary - startBinary) / 1_000_000.0 + " ms");
            System.out.println("----------------------------------");
        }
    }
}

