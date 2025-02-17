// find second maximum element in an array
public class array5 {
    int findSecondMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] >secondMax && arr[i] != max)
            {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args)
    {
        array5 obj = new array5();
        int[] arr = {1,2,3,4,5};
        int secondMax = obj.findSecondMax(arr);
        System.out.println("Second maximum element in the array is: " + secondMax);
    }
}
