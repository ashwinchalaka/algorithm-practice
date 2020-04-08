class Solution {
    public static boolean isNumber(String val) {
        if (val.equals("+"))
            return false;
        else if (val.equals("-"))
            return false;
        else if (val.equals("/"))
            return false;
        else if (val.equals("*"))
            return false;
        else
            return true;
    }
    public static boolean isFirstOperation(int index, String[] tokens) {
        if (isNumber(tokens[index]) && isNumber(tokens[index+1]) && !isNumber(tokens[index+2]))
            return true;
        else
            return false;
    }
    public static int calculateOperation(String val1, String val2, String operator) {
        int result;
        
        switch(operator) {
            case "+":
                result = Integer.parseInt(val1) + Integer.parseInt(val2);
                break;
            case "-":
                result = Integer.parseInt(val1) - Integer.parseInt(val2);
                break;
            case "/":
                result = Integer.parseInt(val1) / Integer.parseInt(val2);
                break;
            case "*":
                result = Integer.parseInt(val1) * Integer.parseInt(val2);
                break;
            default:
                System.out.println("Error in calculation... Invalid operator!");
                result = 0;
                break;
        }
        
        return result;    
    }
    
    
//     MAIN FUNCTION HERE...
    
    public int evalRPN(String[] tokens) {
        int currIndex = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        int result = 0;
        
        while (!(isFirstOperation(currIndex,tokens))) {
            if (currIndex >= tokens.length)
                break;
            
            stack.push(currIndex);
            
            currIndex++;
        }
        
        if (isFirstOperation(currIndex,tokens)) {
            System.out.println("This is the first operation! @index: " + currIndex + " with: " + tokens[currIndex] + " " + tokens[currIndex+2] + " " + tokens[currIndex+1]);
            
            result = calculateOperation(tokens[currIndex],tokens[currIndex+1],tokens[currIndex+2]);
        }
        
        if (!stack.isEmpty())
            currIndex = currIndex+3;
        
        while (!stack.isEmpty()) {
            
        }
        
        return result;
    }
}