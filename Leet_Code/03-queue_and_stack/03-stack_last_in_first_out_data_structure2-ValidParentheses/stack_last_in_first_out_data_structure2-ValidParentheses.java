class Solution {
    public boolean isValid(String s) {        
        char[] parValues = new char[s.length()];
        
        for (int i = 0; i < parValues.length; i++) {
            parValues[i] = s.charAt(i);
        }
        
        // Stack<String> parStack = Stack<String>();
        Deque<String> parStack = new ArrayDeque<String>();
        char lastOnStack = 'a'; // Since the character will never be 'a', we are designating this
                                // character before we start the for loop.
        
        for (int j = 0; j < parValues.length(); j++) {
            if (lastOnStack == 'a' || lastOnStack.size() == 0) {
                if (parValues[j] == ')' || parValues[j] == ']' || parValues[j] == '}')
                    return false;
                else
                    parStack.add(parValues[j]);
            } else if (lastOnStack = '(') {
                if (parValues[j] == '(' || parValues[j] == '[' || parValues[j] == '{')
                    parStack.push(parValues[j]);
                else if (parValues[j] = ')')
                    parStack.pop();
                else
                    return false;
            } else if (lastOnStack = '[') {
                if (parValues[j] == '(' || parValues[j] == '[' || parValues[j] == '{')
                    parStack.push(parValues[j]);
                else if (parValues[j] = ']')
                    parStack.pop();
                else
                    return false;
            } else if (lastOnStack = '{') {
                if (parValues[j] == '(' || parValues[j] == '[' || parValues[j] == '{')
                    parStack.push(parValues[j]);
                else if (parValues[j] = '}')
                    parStack.pop();
                else
                    return false;
            } else {
                System.out.println("Something is wrong.");
            }
            
            lastOnStack = parStack.peek(parStack.size()-1);
        }
        
        if (parStack.empty())
            return true;
        else
            return false;
    }
}