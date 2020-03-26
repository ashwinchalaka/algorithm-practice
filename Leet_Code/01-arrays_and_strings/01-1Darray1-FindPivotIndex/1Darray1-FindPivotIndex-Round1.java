
class Solution {

	public static void main(String[] args) {

		int[][] tests = { 
			{1,7,3,6,5,6},
			{1, 2, 3},
			{-1,-1,1,1,9},
			{9,-1,1,-1,1},
			{0},
			{0,0},
			{1,1,1,3,-1,-1,-1},
			{1,1,1,1,6,-1,-1,-1},
		};

		String printStatement = "";

		for (int i = 0; i < tests.length; i++) {

			printStatement += "\nTest #" + (i+1) + ": [";

			for (int j = 0; j < tests[i].length; j++) {
				printStatement += tests[i][j] + ",";
			}

			printStatement = printStatement.substring(0, printStatement.length() - 1);
			printStatement += "]";

			int pivotIndex = pivotIndex(tests[i]);
			printStatement += "\n" + "Pivot Index: " + pivotIndex + "\n";
		}

		System.out.print(printStatement + "\n");

	}

    public static int pivotIndex(int[] nums) {
        
        // case #1: nums.length == 0
        if (nums.length == 0)
            return -1;
        
        // case #2: nums.length == 1
        if (nums.length == 1)
            return 0;
        
//         
//         NEW SOLUTION
//         
        int leftSum = 0;
        int pivotIndex = 0;
        int rightSum = 0;
        
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        
        while (pivotIndex < nums.length-1) {
            if (leftSum == rightSum)
                return pivotIndex;
            leftSum += nums[pivotIndex];
            rightSum -= nums[pivotIndex+1];
            pivotIndex++;
        }
        if (leftSum == rightSum)
            return pivotIndex;
        
        return -1;
    }
}

        
//                 
//         OLD SOLUTION
//         
        
//         // case #3: if pivotIndex is pointing to first element
//         int a = 0;
//         int b = 0;
//         for (int i = 1; i < nums.length; i++) {
//             b += nums[i];
//         }
//         if (a == b)
//             return 0;
        
//         // case #4: if pivotIndex is in the middle
//         int sum1Index = 0;
//         int pivotIndex = 1;
//         int sum2Index = 2;
        
//         int sum1 = 0;
//         int sum2 = 0;
        
//         while (pivotIndex != nums.length-1) {
            
//             // Calculate sum1
//             sum1 += nums[sum1Index];
            
//             // Calculate sum2
//             for (int i = sum2Index; i < nums.length; i++) {
//                 sum2 += nums[i];
//             }
            
//             // Check if pivot exists
//             if (sum1 == sum2)
//                 return pivotIndex;
            
//             // Else adjust sum1Index
//             sum1Index++;
            
//             // ... and adjust pivotIndex
//             pivotIndex++;
                
//             // ... and adjust sum2Index
//             sum2Index++;
            
//             // ... and reset sum2
//             sum2 = 0;
//         }
        
//         // etch case #5: if pivotIndex is pointing to last element
//         int c = 0;
//         int d = 0;
//         for (int i = 0; i < nums.length-1; i++) {
//             c += nums[i];
//         }
//         if (c == d)
//             return nums.length-1;
        
//         return -1;