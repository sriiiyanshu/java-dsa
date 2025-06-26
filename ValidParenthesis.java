import java.util.Stack;
public class ValidParenthesis {
    static boolean validParen(String str){
        char[] arr=str.toCharArray();
        Stack <Character> stack= new Stack<>();
        for(char c: arr)
        {
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top=stack.peek();
                    if(c=='}' && top=='{' || c==']' && top=='[' || c==')' && top=='('){
                        stack.pop();
                    }
                    else
                    {
                        return false;
                    }
                }         
            }
        }   
        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        String str1="{([])}";
        String str2="{()]]";
        System.out.println(validParen(str1));
        System.out.println(validParen(str2));
    }

}
