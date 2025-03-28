import java.util.*;
public class largest_smallest_Ary_ele {
    public static void main (String args[])
    {
        int n= 7;
        int arr[]= new int[n];
        Scanner sc= new Scanner(System.in);
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
        System.out.print(arr[i]+" ");
        System.err.println();
        }
        System.out.println("\n"+ "the largest number in the array is"+" "+largestNumber(arr));
        System.out.println("\n"+ "the smallest number in the array is"+" "+smallestNumber(arr));
    }
    public static int largestNumber(int arr[]){
        int largest= Integer.MIN_VALUE; //-infinte 
        for(int i=0; i< arr.length;i++){
            if(largest <arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int smallestNumber(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<smallest){
                smallest = arr[i];
            }
        }return smallest;
    } 
}