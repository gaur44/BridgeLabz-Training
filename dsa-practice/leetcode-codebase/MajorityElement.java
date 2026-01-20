class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int element = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            if(count==0) element = nums[i];
            if(nums[i]==element) count++;
            else count--;
        }
        if(count==0) return -1;
        return element;
    }
}
