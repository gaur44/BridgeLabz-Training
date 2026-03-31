class Solution {
    public int searchInsert(int[] nums, int target) {
        // binary search
        int start = 0;
        int end = nums.length-1;
        int last = 0;
        while (start <= end) {
            // calculate the middle index
            int mid = start + ((end - start) / 2);
            int mid_value = nums[mid];
            if (target == mid_value) {
                return mid;
            }
            else if (target > mid_value) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return start;
    }
}
