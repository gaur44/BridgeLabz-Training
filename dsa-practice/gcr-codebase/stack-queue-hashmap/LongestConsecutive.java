import java.util.*;

public class LongestConsecutive {

    static int longestSequence(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);

        int longest = 0;

        for (int x : set) {
            // start only if it's the beginning of a sequence
            if (!set.contains(x - 1)) {
                int curr = x;
                int count = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestSequence(arr));
    }
}
