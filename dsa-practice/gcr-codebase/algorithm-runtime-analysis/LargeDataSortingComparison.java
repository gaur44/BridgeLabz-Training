import java.util.Arrays;
import java.util.Random;

public class LargeDataSortingComparison {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            } 
        }
    }

    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        return arr;
    }

    public static void main(String[] args) {
        int size = 10_000;

        int[] bubbleArr = generateRandomArray(size);
        int[] mergeArr = bubbleArr.clone();
        int[] quickArr = bubbleArr.clone();

        long start, end;

        start = System.nanoTime();
        bubbleSort(bubbleArr);
        end = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        mergeSort(mergeArr);
        end = System.nanoTime();
        System.out.println("Merge Sort Time: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        quickSort(quickArr, 0, quickArr.length - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}

