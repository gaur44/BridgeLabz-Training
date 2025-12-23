// take input of an array with negative and positive numbers and alternate the numbers if there are more negative numbers or positive numbers
// they go in the last

import java.util.Arrays;

public class AlgernateNumberArray {
    public static void main(String[] args) {
        // numbers array
        int[] nums = {1, 2, -2, -4, -5, 8, 1, -3, -5, 7, 9, -2};

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ((i % 2 != 0) && (nums[j] > 0)) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
