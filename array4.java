//minimum value in array
public class array4 {
    int findMinimum(int[] arr)
    {
        int min = arr[0];
        for(int i = 1; i <arr.length; i++)
        {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        array4 obj = new array4();
        int[] arr = {9,2,3,6,7,8};
        int min = obj.findMinimum(arr);
        System.out.println("Minimum element in the array is: " + min);
    }
}
