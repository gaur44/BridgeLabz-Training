import java.util.Arrays;

public class MergeSort {
    public static double[] merge(double[] left, double[] right) {
        double[] res = new double[left.length + right.length];

        int leftPtr = 0, rightPtr = 0, index = 0;

        while (leftPtr < left.length && rightPtr < right.length) {
            if (left[leftPtr] < right[rightPtr]) {
                res[index++] = left[leftPtr++];
            } else {
                res[index++] = right[rightPtr++];
            }
        }

        while (leftPtr < left.length) {
            res[index++] = left[leftPtr++];
        }

        while (rightPtr < right.length) {
            res[index++] = right[rightPtr++];
        }

        return res;
    }

    public static double[] mergeSort(double[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        double[] left = Arrays.copyOfRange(array, 0, mid);
        double[] right = Arrays.copyOfRange(array, mid, array.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static void main(String[] args) {
        double[] marksArray = { 30.9, 10.8, 39.7, 25.5, 60 };
        System.out.println("Before Sorting: " + Arrays.toString(marksArray));

        double[] sorted = MergeSort.mergeSort(marksArray);
        System.out.println("After Sorting: " + Arrays.toString(sorted));
    }
}