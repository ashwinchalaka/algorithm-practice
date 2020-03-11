class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        
        if (nums.length == 1) {
            return 1;
        }
        
        int p4NewArrVals = 1;
        int currentVal = nums[0];
        
        for (int p4Traversing = 1; p4Traversing < nums.length; p4Traversing++) {
            
            if (nums[p4Traversing] != currentVal) {
                nums[p4NewArrVals] = nums[p4Traversing];
                currentVal = nums[p4Traversing];
                p4NewArrVals++;
            }
            
        }
        
        return p4NewArrVals;
    }
}