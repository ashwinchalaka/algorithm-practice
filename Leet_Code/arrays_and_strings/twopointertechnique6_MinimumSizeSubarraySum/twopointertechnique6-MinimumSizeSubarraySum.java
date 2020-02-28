class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int minSAL = nums.length;
        int subArrayLength = 0;
        int subSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            subSum += nums[i];

            if (subSum > s) {
                // subSum -= nums[i];
                
                if (subArrayLength < minSAL)
                    minSAL = subArrayLength;
                
                subArrayLength = 0;
                subSum = 0;
            } else {
                subArrayLength++;
            }
            
        }
        
        if (subArrayLength > 0 && subArrayLength < minSAL) {
            minSAL = subArrayLength;
        }
        
        if (minSAL == nums.length)
            return 0;
        else        
            return minSAL;        
    }
}