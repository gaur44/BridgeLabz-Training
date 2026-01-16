import java.util.Arrays;

public class QuickSort {

    // Partition function
    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high]; // choose last element as pivot
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }

    // Quick Sort function
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // sort left part
            quickSort(arr, low, pivotIndex - 1);

            // sort right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        double[] prices = { 999.99, 199.50, 1500.00, 299.99, 49.99 };

        System.out.println("Before Sorting: " + Arrays.toString(prices));

        quickSort(prices, 0, prices.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(prices));
    }
}
