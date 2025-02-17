//reverse an array
public class array3 {
    void reverseArray(int numbers[], int start, int end)
    {
        while(start<end)
        {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        array3 obj = new array3();
        int[] numbers = {1,2,3,4,5};
        obj.reverseArray(numbers, 0, numbers.length-1);
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
