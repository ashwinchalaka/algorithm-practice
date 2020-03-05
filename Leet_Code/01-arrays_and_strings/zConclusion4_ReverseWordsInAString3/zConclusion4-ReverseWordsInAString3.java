class Solution {
    public String reverseWords(String s) {
        
        if (s.length() == 0)
            return "";
        
        String[] words = s.split(" ");
        
        String s2 = "";
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                char[] chars = words[i].toCharArray();
                String reverseWord = "";
                
                for (int j = chars.length-1; j >= 0; j--) {
                    reverseWord += chars[j];
                }
                
                s2 += reverseWord + " ";
            }
        }
        
        if (s2.length() > 1)
            s2 = s2.substring(0, s2.length()-1);
        
        return s2;
    }
}