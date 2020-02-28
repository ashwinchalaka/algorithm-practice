class Solution {
    // private static void printArr(int[] nums) {
    //     String str = "[";
    //     for (int i = 0; i < nums.length; i++) {
    //         str += nums[i] + ",";
    //     }
    //     str = str.substring(0,str.length()-1);
    //     str += "]";
    //     System.out.println(str);
    // }
    
    public int removeElement(int[] nums, int val) {
        // printArr(nums);
        
        int j = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        // printArr(nums);
        
        return j;
    }
}