class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;
        int index;
        
        for (index = 0; index < nums.length; index++) {
            rightSum += nums[index];
        }
        
        int leftSum = 0;
        index = 0;
        
        for (index = 0; index < nums.length; index++) {
            rightSum = rightSum - nums[index];
            
            if (rightSum == leftSum)
                return index;
            
            leftSum += nums[index];
        }
        
        return -1;
    }
}