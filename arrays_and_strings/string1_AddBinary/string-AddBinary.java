class Solution {
    public String addBinary(String a, String b) {
        
        String binarySum = "";

        int aPointer = a.length()-1;
        int bPointer = b.length()-1;
        
        int valueAtAPointer;
        int valueAtBPointer;
        int remainder = 0;
        
        while (aPointer > -1 && bPointer > -1) {
            
            valueAtAPointer = Character.getNumericValue(a.charAt(aPointer));
            valueAtBPointer = Character.getNumericValue(b.charAt(bPointer));
            
            if (valueAtAPointer == 0 && valueAtBPointer == 0) {
                if (remainder == 1) {
                    binarySum = "1" + binarySum;
                    remainder = 0;
                } else {
                    binarySum = "0" + binarySum;
                }
            } else if (valueAtAPointer == 1 && valueAtBPointer == 1) {
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
            
            aPointer--;
            bPointer--;
        }
        
        if (aPointer > -1) {
            if (remainder == 1) {
                while (remainder == 1 && aPointer > -1) {
                    valueAtAPointer = Character.getNumericValue(a.charAt(aPointer));
                    
                    if (valueAtAPointer == 0) {
                        binarySum = "1" + binarySum;
                        remainder = 0;
                    } else {
                        binarySum = "0" + binarySum;
                        remainder = 1;
                    }
                    
                    aPointer--;
                }
                
                if (aPointer > -1) {
                    binarySum = a.substring(0, aPointer) + binarySum;
                } else {
                    if (remainder == 1) {
                        binarySum = "1" + binarySum;
                        remainder = 0;
                    }
                }
            }
        } else if (bPointer > -1) {
            if (remainder == 1) {        
                while (remainder == 1 && bPointer > -1) {
                    valueAtBPointer = Character.getNumericValue(b.charAt(bPointer));
                    
                    if (valueAtBPointer == 0) {
                        binarySum = "1" + binarySum;
                        remainder = 0;
                    } else {
                        binarySum = "0" + binarySum;
                        remainder = 1;
                    }
                    
                    bPointer--;
                }
                
                if (bPointer > -1) {
                    binarySum = b.substring(0, bPointer) + binarySum;
                } else {
                    if (remainder == 1) {
                        binarySum = "1" + binarySum;
                        remainder = 0;
                    }
                }
            }
        } else {
            if (remainder == 1) {
                binarySum = "1" + binarySum;
                remainder = 0;
            }
        }
            
        return binarySum;
    }
}