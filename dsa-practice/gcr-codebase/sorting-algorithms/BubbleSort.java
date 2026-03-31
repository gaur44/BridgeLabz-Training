import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(double[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean swapped = false;

            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    double tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                }

            }

            // break early if no swaps happened -- array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        double[] marksArray = { 30.9, 10.8, 39.7, 25.5 };
        System.out.println("Before Sorting: " + Arrays.toString(marksArray));

        BubbleSort.bubbleSort(marksArray);
        System.out.println("After Sorting: " + Arrays.toString(marksArray));
    }
}