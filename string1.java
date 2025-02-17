//check string is palindrome or not
public class string1 {
    public boolean isPalindrome(String word)
    {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while(start<end)
        {
            if(charArray[start] != charArray[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        string1 obj = new string1();
        System.out.println(obj.isPalindrome("madam"));
        System.out.println(obj.isPalindrome("hello"));
        System.out.println();
    }
}