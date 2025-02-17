//valid Parenthesis
import java.util.*;
class validParen
{
    public boolean isValid(String s)
    {
        Stack <Character> stack = new Stack<>();
        for(char c: s.toCharArray())
        {
            if(c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else if (stack.isEmpty())
            {
                return false;
            }
            else
            {
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '['))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        validParen obj = new validParen();
        String s = "({[]})";
        System.out.println(obj.isValid(s));
        String s1 = "({[})";
        System.out.println(obj.isValid(s1));
    }
}