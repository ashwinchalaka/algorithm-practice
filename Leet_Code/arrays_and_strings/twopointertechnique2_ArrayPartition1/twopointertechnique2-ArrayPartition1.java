class Solution {
    
    private static void sortNums(int[] nums) {
        if (nums.length < 2)
            return;
        
        int NumOfPairsInOrder = 0;
        int p1 = 0;
        int p2 = 1;
        
        while (NumOfPairsInOrder < nums.length-1) {
            
            NumOfPairsInOrder = 0;
            p1 = 0;
            p2 = 1;
            
            while (p2 < nums.length) {
                if (nums[p1] > nums[p2]) {
                    int temp = nums[p1];
                    nums[p1] = nums[p2];
                    nums[p2] = temp;
                } else {
                    NumOfPairsInOrder++;
                }

                p1++;
                p2++;
            }
        }
    }
    
    private static void printArr(int[] nums) {
        String str = "[";
        
        for (int i = 0; i < nums.length; i++) {
            str += nums[i] + ",";
        }
        
        str = str.substring(0,str.length()-1);
        str += "]";
        
        System.out.println(str);
    }
    
    public int arrayPairSum(int[] nums) {
        
        // sortNums(nums);
        Arrays.sort(nums);
        // printArr(nums);
        
        int p1 = 0;
        int p2 = 1;
        
        int arrayPairSum = 0;
        
        while (p2 < nums.length) {
            
            arrayPairSum += Math.min(nums[p1],nums[p2]);
            
            p1 = p1 + 2;
            p2 = p2 + 2;
        }
        
        return arrayPairSum;
    }
}