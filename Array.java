import java.util.*;
public class Array 
{
    public static void main(String[] args) 
    {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
