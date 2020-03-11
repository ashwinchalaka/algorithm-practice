class Solution {
    private static void printArr(String[] words) {
        String str = "[";

        for (int i = 0; i < words.length; i++) {
            str += words[i] + ",";
        }

        if (str.length() > 1)        
            str = str.substring(0,str.length()-1);
        
        str += "]";

        System.out.println(str);
    }
    
    public String reverseWords(String s) {
        
        if (s.length() == 0)
            return "";
        
        String[] words = s.split(" ");
        
        String s2 = "";
        
        printArr(words);
        
        for (int i = words.length-1; i >= 0; i--) {
            if (words[i].length() > 0)
                s2 += words[i] + " ";
        }
        
        if (s2.length() > 1)
            s2 = s2.substring(0, s2.length()-1);
        
        return s2;        
    }
}