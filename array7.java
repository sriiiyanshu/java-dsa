//find missing number in an array
public class array7
{
    int findMissing(int[] arr)
    {
        int n = arr.length + 1;
        int sum = n * (n + 1)/2;
        for(int num : arr)
        {
            sum = sum-num;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        array7 a = new array7();
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.println("\nMissing number is: " + a.findMissing(arr));
        System.out.println();
    }
}