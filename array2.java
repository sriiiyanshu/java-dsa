//remove even integers from the array
public class array2 {
    int[] removeEven(int[] arr)
    {
        int oddCount = 0;
        for(int  i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 != 0)
                {
                    oddCount++;
                }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 != 0)
            {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        array2 obj = new array2();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] result = obj.removeEven(arr);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}