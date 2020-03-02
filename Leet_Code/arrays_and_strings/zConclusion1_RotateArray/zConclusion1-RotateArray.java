class Solution {
    public void rotate(int[] nums, int k) {
        
        int p1 = k-1;
        int p2 = nums.length-1;
        
        for (int i = 0; i < k; i++) {
            nums[p1] += nums[p2];
            nums[p2] = nums[p1] - nums[p2];
            nums[p1] -= nums[p2];
            p1--;
            p2--;
        }       
    }
}