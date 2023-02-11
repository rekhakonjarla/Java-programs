public class Missing_Array 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 4, 5,6};
        System.out.println(""+ Missing(arr));
    }
    
    public static int Missing(int arr[]) 
    {
        int arraySum = (arr[arr.length-1] * (arr[arr.length-1] + 1)) / 2;
        for (int i : arr) 
        {
            arraySum -= i;
        }
        return arraySum;
    }
}