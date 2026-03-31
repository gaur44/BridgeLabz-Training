import java.util.Arrays;

public class HeapSort {
    public static void heapSort(double[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            // Move current root (largest) to end
            double temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify a subtree rooted at index i
    public static void heapify(double[] arr, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            double temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, heapSize, largest);
        }
    }

    public static void main(String[] args) {
        double[] salaries = { 55000, 72000, 48000, 90000, 61000 };

        System.out.println("Before Sorting: " + Arrays.toString(salaries));

        heapSort(salaries);

        System.out.println("After Sorting: " + Arrays.toString(salaries));
    }
}
