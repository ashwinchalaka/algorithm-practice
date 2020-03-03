class Solution {
    public void moveZeroes(int[] nums) {
        
        int p4ZeroSwap = 0;
        int zeroCount = 0;
        int hold;
        
        for (int p4Traverse = 0; p4Traverse < nums.length; p4Traverse++) {
            if (nums[p4Traverse] != 0) {
                if (zeroCount != 0) {
                    hold = nums[p4ZeroSwap];
                    nums[p4ZeroSwap] = nums[p4Traverse];
                    nums[p4Traverse] = hold;
                }
                
                p4ZeroSwap++;
                // zeroCount--;
            } else if (nums[p4Traverse] == 0)
                zeroCount++;
        }
    }
}