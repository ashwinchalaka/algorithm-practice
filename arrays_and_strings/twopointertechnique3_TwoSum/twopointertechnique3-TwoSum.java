class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] twoSum = new int[2];
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    twoSum[0] = i+1;
                    twoSum[1] = j+1;
                }   
            }
        }
        
        return twoSum;
    }
}

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
        
//         int upperLimitIndex = 0;
        
//         while (numbers[upperLimitIndex] < target) {
//             upperLimitIndex++;
            
//             if (upperLimitIndex > numbers.length-2)
//                 break;
//         }
        
//         int p1 = 0;
//         int p2 = p1+1;
        
//         int[] twoSum = new int[2];
        
//         while (twoSum[0] == 0 && twoSum[1] == 0) {
//             while (p2 < upperLimitIndex) {
//                 if (numbers[p1] + numbers[p2] == target) {
//                     twoSum[0] = p1+1;
//                     twoSum[1] = p2+1;
//                     return twoSum;
//                 }
//                 p2++;
//             }
//             p1++;
//             p2 = p1+1;
//             if (p2 > numbers.length-1)
//                 break;
//         }
        
//         return twoSum;
//     }
// }