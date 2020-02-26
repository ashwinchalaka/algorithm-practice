class Solution {
    public int strStr(String haystack, String needle) {
        
        boolean etch1 = needle.length() == 0;
        boolean etch2 = haystack.compareTo(needle) == 0;
        
        if (etch1 || etch2)
            return 0;
        
        etch1 = haystack.length() == 0 && needle.length() > 0;
        etch2 = haystack.length() < needle.length();
        
        if (etch1 || etch2)
            return -1;
        
        int haystackPointer = 0;
        int lengthDiff = haystack.length() - needle.length();

        String subStrToCompare = haystack.substring(
            haystackPointer, haystackPointer+needle.length());

        while (haystackPointer < lengthDiff) {

            if (subStrToCompare.compareTo(needle) == 0)
                return haystackPointer;

            haystackPointer++;
            subStrToCompare = haystack.substring(haystackPointer, haystackPointer+needle.length());
        }

        if (haystackPointer+needle.length() > haystack.length()) {
            return -1;
        } else {
            subStrToCompare = haystack.substring(haystackPointer, haystackPointer+needle.length());
            if (subStrToCompare.compareTo(needle) == 0)
                return haystackPointer;
        }
        
        return -1;        
    }
}