class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length < 1)
            return -1;
        
        if (nums.length == 1)
            return 0;
        
        int index4LargestVal = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[index4LargestVal])
                index4LargestVal = i;
        }
        
        int currentDominantIndex = index4LargestVal;
        
        for (int j = 0; j < nums.length; j++) {
            if (j != currentDominantIndex) {
                if (nums[currentDominantIndex] >= 2*nums[j])
                    currentDominantIndex = currentDominantIndex;
                else
                    return -1;
            }
        }
        
        return currentDominantIndex;
    }
}

// class Solution {
//     public int dominantIndex(int[] nums) {
//         if (nums.length < 1)
//             return -1;
        
//         if (nums.length == 1)
//             return 0;
        
//         int currentDominantIndex = -1;
        
//         for (int i = 0; i < nums.length-1; i++) {
//             if (nums[i] > nums[i+1]) {
//                 if (nums[i] >= 2*nums[i+1]) {
//                     if (currentDominantIndex == -1)
//                         currentDominantIndex = i;
//                     else {
//                         if (nums[currentDominantIndex] >= 2*nums[i])
//                             currentDominantIndex = currentDominantIndex;
//                         else
//                             currentDominantIndex = i;                        
//                     }
//                 }
//             }
//             else {
//                 if (nums[i+1] >= 2*nums[i]) {
//                     if (currentDominantIndex == -1)
//                         currentDominantIndex = i+1;
//                     else {
//                         if (nums[currentDominantIndex] >= 2*nums[i+1])
//                             currentDominantIndex = currentDominantIndex;
//                         else
//                             currentDominantIndex = i+1;
//                     }
//                 }
//             }
//         }
        
//         return currentDominantIndex;
//     }
// }


// WHEN I THOUGHT THAT THE FUNCTION RETURNS THE VALUE OF THE ELEMENT INSTEAD OF THE INDEX...

// class Solution {
//     private int[] removeArrayElement(int[] arr, int index) {
//         int[] newArr = new int[arr.length-1];
//         int newArrIndexTracker = 0;
        
//         for (int i = 0; i < arr.length; i++) {
//             if (i != index) {
//                 newArr[newArrIndexTracker] = arr[i];
//                 newArrIndexTracker++;
//             }
//         }
        
//         return newArr;
//     }
    
//     public int dominantIndex(int[] nums) {
        
//         if (nums.length < 1)
//             return -1;
        
//         if (nums.length == 1)
//             return nums[0];
        
//         // index pointers
//         int e1Index = 0;
//         int e2Index = 1;
        
//         // recursion helpers
//         int[] numsV2 = nums;
//         int returnVal = -1;
        
//         if (nums[e1Index] > nums[e2Index]) {
//             if (nums[e1Index] >= 2*nums[e2Index]) {
//                 numsV2 = removeArrayElement(nums, e2Index);
//                 returnVal = dominantIndex(numsV2);
//             }
//         }
//         else {
//             if (nums[e2Index] >= 2*nums[e1Index]) {
//                 numsV2 = removeArrayElement(nums, e1Index);
//                 returnVal = dominantIndex(numsV2);
//             }
//         }
        
//         return returnVal;
//     }
// }