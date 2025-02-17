//print elements of an array
class array1
{
    public void printArray(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        array1 obj = new array1();
        int[] arr = {1,2,3,4,5};
        obj.printArray(arr);
    }
}