import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(double[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;   // assume current position has smallest value

            // find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // swap the found minimum with the first unsorted element
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        double[] scores = { 78.5, 92.0, 65.5, 88.0, 70.0 };

        System.out.println("Before Sorting: " + Arrays.toString(scores));

        selectionSort(scores);

        System.out.println("After Sorting: " + Arrays.toString(scores));
    }
}
