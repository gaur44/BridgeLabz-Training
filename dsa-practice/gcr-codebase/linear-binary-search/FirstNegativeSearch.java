public class FirstNegativeSearch {

    public static void main(String[] args) {
        int[] arr = {5, 10, 3, -4, 8, -2};

        int result = findFirstNegative(arr);
        System.out.println(result);
    }

    static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}
