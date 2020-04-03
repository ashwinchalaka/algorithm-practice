class Solution {
    public boolean isValid(String s) {        
        char[] parValues = new char[s.length()];
        
        for (int i = 0; i < parValues.length; i++) {
            parValues[i] = s.charAt(i);
        }
        
        Stack<Character> parStack = new Stack<Character>();
        
        for (int j = 0; j < parValues.length; j++) {
            if (parStack.empty()) {
                if (parValues[j] == ')' || parValues[j] == ']' || parValues[j] == '}')
                    return false;
                else
                    parStack.add(parValues[j]);
            } else if (parStack.peek() == '(') {
                if (parValues[j] == '(' || parValues[j] == '[' || parValues[j] == '{')
                    parStack.push(parValues[j]);
                else if (parValues[j] == ')')
                    parStack.pop();
                else
                    return false;
            } else if (parStack.peek() == '[') {
                if (parValues[j] == '(' || parValues[j] == '[' || parValues[j] == '{')
                    parStack.push(parValues[j]);
                else if (parValues[j] == ']')
                    parStack.pop();
                else
                    return false;
            } else if (parStack.peek() == '{') {
                if (parValues[j] == '(' || parValues[j] == '[' || parValues[j] == '{')
                    parStack.push(parValues[j]);
                else if (parValues[j] == '}')
                    parStack.pop();
                else
                    return false;
            } else {
                System.out.println("Something is wrong.");
            }
        }
        
        if (parStack.empty())
            return true;
        else
            return false;
    }
}