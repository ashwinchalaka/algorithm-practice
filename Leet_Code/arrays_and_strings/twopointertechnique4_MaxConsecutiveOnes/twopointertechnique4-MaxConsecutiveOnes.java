class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        boolean etch1 = nums.length == 0;
        boolean etch2 = nums.length == 1;
        
        if (etch1)
            return 0;
        
        if (etch2) {
            if (nums[0] == 1)
                return 1;
            else
                return 0;
        }
        
        int maxCOs = 0;
        int oneCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] == 1)
                oneCount++;
            else {
                maxCOs = oneCount;
                oneCount = 0;
            }
            
        }
        
        return maxCOs;      
    }
}