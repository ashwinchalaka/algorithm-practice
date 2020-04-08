class Solution {
    public static boolean isOperator(String val) {
        if (val.equals("+"))
            return true;
        else if (val.equals("-"))
            return true;
        else if (val.equals("/"))
            return true;
        else if (val.equals("*"))
            return true;
        else
            return false;
    }
    public static int calculateOperation(int val1, int val2, String operator) {
        int result;
        
        switch(operator) {
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "/":
                result = val1 / val2;
                break;
            case "*":
                result = val1 * val2;
                break;
            default:
                System.out.println("Error in calculation... Invalid operator!");
                result = 0;
                break;
        }
        
        return result;    
    }
    
    public int evalRPN(String[] tokens) {
        if (tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        
        int result = 0;
        int currIndex = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        while (currIndex < tokens.length) {
            
            if (isOperator(tokens[currIndex])) {
                int rightOperand = stack.pop();
                int leftOperand = stack.pop();
                
                result = calculateOperation(leftOperand, rightOperand, tokens[currIndex]);
                System.out.println(leftOperand + " " + tokens[currIndex] + " " + rightOperand + " = " + result);
                
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(tokens[currIndex]));
            }
            
            currIndex++;
        }
        
        return result;
    }
}