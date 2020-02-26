class Solution {
    public String addBinary(String a, String b) {
        
        int remainder = 0;
        int aPointer = a.length()-1;
        int bPointer = b.length()-1;
        
        String binarySum = "";
        String tempStr = "";
        
        if (a.length() == b.length()) {
            
            for (int i = a.length()-1; i >= 0; i--) {
                if (Character.getNumericValue(a.charAt(i)) == 0 && Character.getNumericValue(b.charAt(i)) == 0) {
                    if (remainder == 1) {
                        tempStr = "1" + binarySum;
                        binarySum = tempStr;
                        remainder = 0;
                    } else {
                        tempStr = "0" + binarySum;
                        binarySum = tempStr;
                    }
                    
                } else if (Character.getNumericValue(a.charAt(i)) == 1 && Character.getNumericValue(b.charAt(i)) == 1) {
                    if (remainder == 1) {
                        tempStr = "1" + binarySum;
                        binarySum = tempStr;
                        remainder = 1;
                    } else {
                        tempStr = "0" + binarySum;
                        binarySum = tempStr;
                        remainder = 1;
                    }
                } else {
                    if (remainder == 1) {
                        tempStr = "0" + binarySum;
                        binarySum = tempStr;
                        remainder = 1;
                    } else
                        tempStr = "1" + binarySum;
                        binarySum = tempStr;
                }
            }
            
            if (remainder == 1) {
                tempStr = "1" + binarySum;
                binarySum = tempStr;
                remainder = 0;
            }
        // }
        } else if (a.length() > b.length()) {
            for (int i = b.length()-1; i >= 0; i--) {
                
                // System.out.println("a @ index " + i + " = " + Character.getNumericValue(a.charAt(i)));
                // System.out.println("b @ index " + i + " = " + Character.getNumericValue(b.charAt(i)));
                
                if (Character.getNumericValue(a.charAt(i)) == 0 && Character.getNumericValue(b.charAt(i)) == 0) {
                    System.out.println("2x ZERO");
                    if (remainder == 1) {
                        tempStr = "1" + binarySum;
                        binarySum = tempStr;
                        remainder = 0;
                    } else {
                        tempStr = "0" + binarySum;
                        binarySum = tempStr;
                    }
                    
                } else if (Character.getNumericValue(a.charAt(i)) == 1 && Character.getNumericValue(b.charAt(i)) == 1) {
                    System.out.println("2x ONE");
                    if (remainder == 1) {
                        tempStr = "1" + binarySum;
                        binarySum = tempStr;
                        remainder = 1;
                    } else {
                        tempStr = "0" + binarySum;
                        binarySum = tempStr;
                        remainder = 1;
                    }
                } else {
                    System.out.println("1x ONE, 1x ZERO");
                    if (remainder == 1) {
                        tempStr = "0" + binarySum;
                        binarySum = tempStr;
                        remainder = 1;
                    } else
                        tempStr = "1" + binarySum;
                        binarySum = tempStr;
                }
            }
        } else if (a.length() < b.length()) {
            for (int i = a.length()-1; i >= 0; i--) {
                
                // System.out.println("a @ index " + i + " = " + Character.getNumericValue(a.charAt(i)));
                // System.out.println("b @ index " + i + " = " + Character.getNumericValue(b.charAt(i)));
                
                if (Character.getNumericValue(a.charAt(i)) == 0 && Character.getNumericValue(b.charAt(i)) == 0) {
                    System.out.println("2x ZERO");
                    if (remainder == 1) {
                        tempStr = "1" + binarySum;
                        binarySum = tempStr;
                        remainder = 0;
                    } else {
                        tempStr = "0" + binarySum;
                        binarySum = tempStr;
                    }
                    
                } else if (Character.getNumericValue(a.charAt(i)) == 1 && Character.getNumericValue(b.charAt(i)) == 1) {
                    System.out.println("2x ONE");
                    if (remainder == 1) {
                        tempStr = "1" + binarySum;
                        binarySum = tempStr;
                        remainder = 1;
                    } else {
                        tempStr = "0" + binarySum;
                        binarySum = tempStr;
                        remainder = 1;
                    }
                } else {
                    System.out.println("1x ONE, 1x ZERO");
                    if (remainder == 1) {
                        tempStr = "0" + binarySum;
                        binarySum = tempStr;
                        remainder = 1;
                    } else
                        tempStr = "1" + binarySum;
                        binarySum = tempStr;
                }
            }
        } else {
            System.out.println("Something went wrong");
        }
        
        return binarySum;
    }
}