class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        // if (nums.length == 1 && nums[0] >= s)
        //     return 1;            
        
        int minSAL = nums.length;
        
        int subLength = 0;
        int subSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            int pointer = i;
            subLength = 0;
            subSum = 0;
            
            while (subSum < s && pointer < nums.length) {
                subSum += nums[pointer];
                subLength++;
                
                if (subSum >= s) {
                    if (subLength < minSAL)
                        minSAL = subLength;

                    subLength = 0;
                    subSum = 0;
                }
                
                pointer++;
            }
        }

        return minSAL;
    }
}