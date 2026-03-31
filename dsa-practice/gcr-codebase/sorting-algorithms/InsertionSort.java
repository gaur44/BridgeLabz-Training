import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(double[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (array[j] < array[j - 1]) {
                    double tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
                else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] marksArray = { 30.9, 10.8, 39.7, 25.5 };
        System.out.println("Before Sorting: " + Arrays.toString(marksArray));

        InsertionSort.insertionSort(marksArray);
        System.out.println("After Sorting: " + Arrays.toString(marksArray));
    }
}