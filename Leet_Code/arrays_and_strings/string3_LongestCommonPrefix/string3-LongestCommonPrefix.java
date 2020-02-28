class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        boolean etch1 = strs.length == 0;
        boolean etch2 = strs.length == 1;
        
        if (etch1)
            return "";
        
        if (etch2)
            return strs[0];
        
        int strPointer = 0;
        String currentPrefix = strs[0].substring(0,strPointer);
        
        int matchCount = 0;
        String longestCommonPrefix = "";
        
        for (int i = 0; i < strs[0].length(); i++) {
            
            if (strPointer < strs[0].length())
                strPointer++;
            else 
                break;
            
            currentPrefix = strs[0].substring(0,strPointer);
            System.out.println(currentPrefix);
            
            matchCount = 0;
                
            for (int j = 0; j < strs.length; j++) {
                if (strPointer <= strs[j].length()) {
                    String nextElementPrefix = strs[j].substring(0,strPointer);

                    if (currentPrefix.compareTo(nextElementPrefix) == 0)
                        matchCount++;                    
                } else
                    return longestCommonPrefix;
            }
            
            if (matchCount == strs.length)
                longestCommonPrefix = currentPrefix;
        }
        
        return longestCommonPrefix;
    }
}