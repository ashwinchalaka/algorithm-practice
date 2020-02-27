class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0)
            return "";
        
        if (strs.length == 1)
            return strs[0];
        
        String longestCommonPrefix = strs[0];
        int strPointer = strs[0].length()-1;
        
        int matchCount = 0;
        
        System.out.println("strs length = " + strs.length);
        
        for (int i = 0; i < strs[0].length(); i++) {
            
            longestCommonPrefix = strs[0].substring(0,strPointer);
            System.out.println(longestCommonPrefix);
            matchCount = 0;
                
            for (int j = 0; j < strs.length; j++) {
                
                
                
                if (longestCommonPrefix.compareTo(strs[j]) == 0)
                    matchCount++;
            }
            
            System.out.println("matchCount = " + matchCount);
            
            if (matchCount == strs.length)
                return longestCommonPrefix;
            
            strPointer--;
        }
        
        return "";
    }
}