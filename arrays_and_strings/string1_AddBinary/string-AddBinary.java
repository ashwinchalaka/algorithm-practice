class Solution {
    public String addBinary(String a, String b) {
        
        String binarySum = "";

        String bi1 = a;
        String bi2 = b;
        
        if (bi1.length() > bi2.length()) {
            int difference = bi1.length() - bi2.length();
            
            String extraZeros = "";
            
            for (int i = 0; i < difference; i++) {
                extraZeros += "0";
            }
            
            bi1 = extraZeros + bi1;
        }
        
        if (bi2.length() > bi1.length()) {
            int difference = bi2.length() - bi1.length();
                        
            String extraZeros = "";
            
            for (int i = 0; i < difference; i++) {
                extraZeros += "0";
            }
            
            bi2 = extraZeros + bi2;
        }
        
        int bi1Pointer = bi1.length()-1;
        int bi2Pointer = bi2.length()-1;
        
        int valueAtbi1Pointer;
        int valueAtbi2Pointer;
        int remainder = 0;
        
        while (bi1Pointer > -1 && bi2Pointer > -1) {
            
            valueAtbi1Pointer = Character.getNumericValue(bi1.charAt(bi1Pointer));
            valueAtbi2Pointer = Character.getNumericValue(bi2.charAt(bi2Pointer));
            
            if (valueAtbi1Pointer == 0 && valueAtbi2Pointer == 0) {
                if (remainder == 1) {
                    binarySum = "1" + binarySum;
                    remainder = 0;
                } else {
                    binarySum = "0" + binarySum;
                }
            } else if (valueAtbi1Pointer == 1 && valueAtbi2Pointer == 1) {
                if (remainder == 1) {
                    binarySum = "1" + binarySum;
                    remainder = 1;
                } else {
                    binarySum = "0" + binarySum;
                    remainder = 1;
                }
            } else {
                if (remainder == 1) {
                    binarySum = "0" + binarySum;
                    remainder = 1;
                } else
                    binarySum = "1" + binarySum;
            }
            
            bi1Pointer--;
            bi2Pointer--;
        }
        
        if (remainder == 1) {
            binarySum = "1" + binarySum;
            remainder = 0;
        }
            
        return binarySum;
    }
}