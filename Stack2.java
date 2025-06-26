import java.util.Stack;
public class Stack2 {
    public static String reverseString(String str) {
        Stack <Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for( char c: chars){
            stack.push(c);
        }
        for(int i=0; i<str.length();i++)
        {
            chars[i]=stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Sriyanshu"));
    }
}
