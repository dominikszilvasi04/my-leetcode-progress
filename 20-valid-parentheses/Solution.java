import java.util.Stack;

class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();

        for (char character : s.toCharArray())
        {
            if (character == '(' || character == '[' || character == '{')
            {
                stack.push(character);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top = stack.pop();
                
                if (character == ')' && top != '(')
                {
                    return false;
                }
                if (character == ']' && top != '[')
                {
                    return false;
                }
                if (character == '}' && top != '{')
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}