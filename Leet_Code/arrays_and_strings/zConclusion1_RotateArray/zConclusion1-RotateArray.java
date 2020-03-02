class Solution {
    private static void printNums(int[] nums) {
        String str = "[";
        
        for (int i = 0; i < nums.length; i++) {
            str += nums[i] + ",";
        }
        
        str = str.substring(0,str.length()-1);
        str += "]";
        
        System.out.println(str);
    }
    
    public void rotate(int[] nums, int k) {
        
        if (nums.length == 1)
            return;
        
        if (k == 0)
            return;
        
        int p1 = 0;
        int p2 = nums.length-k;
        
        boolean p1IsValid;
        
        while (p1 < nums.length-k) {

            // System.out.println(p1 + ", " + p2);

            nums[p1] += nums[p2];
            nums[p2] = nums[p1] - nums[p2];
            nums[p1] -= nums[p2];

            // printNums(nums);

            p1++;
            p2++;

            if (p2 >= nums.length)
                p2 = nums.length-k;
        }
        
        if (nums.length % 2 == 1) {
            nums[p1] += nums[p2];
            nums[p2] = nums[p1] - nums[p2];
            nums[p1] -= nums[p2];
            
            p1++;
            p2++;

            if (p2 >= nums.length)
                p2 = nums.length-k;
            
            nums[p1] += nums[p2];
            nums[p2] = nums[p1] - nums[p2];
            nums[p1] -= nums[p2];
        }
        
    }
}