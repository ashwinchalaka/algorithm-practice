class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.compareTo("") == 0)
            return 0;
        
        int lengthDiff = haystack.length() - needle.length();
        
        if (lengthDiff == 0) {
            if (haystack.compareTo(needle) == 0)
                return 0;
        } else {
            
            int haystackPointer = 0;
            String subStrToCompare;
            
            while (haystackPointer < haystack.length()-lengthDiff) {
                subStrToCompare = haystack.substring(haystackPointer, haystackPointer+needle.length());
                System.out.println(subStrToCompare);
                if (subStrToCompare.compareTo(needle) == 0)
                    return haystackPointer;
                haystackPointer++;
            }
            
            // subStrToCompare = haystack.substring(haystackPointer, haystackPointer+needle.length());
            // System.out.println(subStrToCompare);
            // if (subStrToCompare.compareTo(needle) == 0)
            //     return haystackPointer;
        }
        
        return -1;        
    }
}