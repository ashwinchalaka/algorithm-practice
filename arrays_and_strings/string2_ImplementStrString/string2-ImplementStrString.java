class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.compareTo("") == 0)
            return 0;
        
        int lengthDiff = haystack.length() - needle.length();
        
        if (lengthDiff == 0) {
            if (haystack.compareTo(needle) == 0)
                return 0;
        } else {
            for (int i = 0; i < haystack.length()-lengthDiff; i++) {
                String subStrToCompare = haystack.substring(i, i+needle.length());
                System.out.println(subStrToCompare);
                if (subStrToCompare.compareTo(needle) == 0)
                    return i;
            }
        }
        
        return -1;        
    }
}