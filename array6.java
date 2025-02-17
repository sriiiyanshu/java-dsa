//move zeroes to end of array
public class array6
{
    public void moveZero(int[] arr, int n)
    {
        int j=0;
        for(int  i = 0; i < n; i++)
        {
            if(arr[i] != 0 && arr[j] == 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0)
            {
                j++;
            }
        }
    }

    public static void main(String[] args)
    {
        array6 obj = new array6();
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int n = arr.length;
        obj.moveZero(arr, n);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}