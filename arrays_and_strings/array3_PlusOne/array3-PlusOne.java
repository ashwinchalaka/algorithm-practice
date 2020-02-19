class Solution {
    public int[] plusOne(int[] digits) {
        int indexPointer = digits.length-1;
        while (indexPointer >= 0) {
            if (digits[indexPointer] != 9) {
                digits[indexPointer] = digits[indexPointer] + 1;
                return digits;
            } else {
                digits[indexPointer] = 0;
                indexPointer--;
            }
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }
}

// class Solution {
//     public int[] plusOne(int[] digits) {
        
//         boolean endsWithNine = false;
        
//         if (digits[digits.length-1] == 9)
//             endsWithNine = true;
        
//         if (!endsWithNine) {
//             digits[digits.length-1] = digits[digits.length-1] + 1;
//             return digits;
//         } else if (endsWithNine && digits.length == 1) {
//             int[] newDigits = {1,0};
//             return newDigits;
//         } else {
//             int nineCount = 0;
            
//             for (int i = digits.length-1; i >= 0; i--) {
//                 if (digits[i] == 9)
//                     nineCount++;
//                 else
//                     break;
//             }
            
//             if (nineCount == digits.length) {
//                 int[] newDigits = new int[digits.length+1];
//                 newDigits[0] = 1;
//                 return newDigits;
                
//             } else {
//                 int indexPointer = digits.length-1;

//                 while (nineCount > 0) {
//                     digits[indexPointer] = 0;
//                     indexPointer--;
//                     nineCount--;
//                 }

//                 digits[indexPointer] = digits[indexPointer] + 1;

//                 return digits;
//             }    
//         }
//     }
// }