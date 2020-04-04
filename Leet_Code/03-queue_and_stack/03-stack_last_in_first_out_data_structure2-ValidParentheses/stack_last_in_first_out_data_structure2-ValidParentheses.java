class Solution {
    public boolean isValid(String s) {        
        if (s == "")
            return true;
        else if (s.length() % 2 == 1)
            return false;
        
        Stack<Character> parStack = new Stack<Character>();
        
        for (int j = 0; j < s.length(); j++) {
            if (parStack.empty()) {
                if (s.charAt(j) == ')' || s.charAt(j) == ']' || s.charAt(j) == '}')
                    return false;
                else
                    parStack.add(s.charAt(j));
            } else if (parStack.peek() == '(') {
                if (s.charAt(j) == '(' || s.charAt(j) == '[' || s.charAt(j) == '{')
                    parStack.push(s.charAt(j));
                else if (s.charAt(j) == ')')
                    parStack.pop();
                else
                    return false;
            } else if (parStack.peek() == '[') {
                if (s.charAt(j) == '(' || s.charAt(j) == '[' || s.charAt(j) == '{')
                    parStack.push(s.charAt(j));
                else if (s.charAt(j) == ']')
                    parStack.pop();
                else
                    return false;
            } else if (parStack.peek() == '{') {
                if (s.charAt(j) == '(' || s.charAt(j) == '[' || s.charAt(j) == '{')
                    parStack.push(s.charAt(j));
                else if (s.charAt(j) == '}')
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