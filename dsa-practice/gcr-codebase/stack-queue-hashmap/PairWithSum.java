import java.util.*;

public class PairWithSum {

    static boolean hasPair(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int x : arr) {
            if (seen.contains(target - x)) {
                return true;
            }
            seen.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println(hasPair(arr, target));
    }
}
