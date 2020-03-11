class Solution {
    public void reverseString(char[] s) {
        
        int frontPointer = 0;
        int backPointer = s.length-1;
        
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[frontPointer];
            s[frontPointer] = s[backPointer];
            s[backPointer] = temp;
            frontPointer++;
            backPointer--;
        }
    }
}