// import java.util.*;
public class binarySearchPrg {
    public static void main(String args[])
    {
        int arr[]= {2,4,6,8,10,12,14,16};
        System.out.println("the element is at index" +" "+binarySearch(arr));
    }
    public static int binarySearch(int arr[]){
        int min=0;
        int max= arr.length -1;
        int target=12;
        while(min<=max){
            int mid =(min+max)/2;
            if(arr[mid]== target)
            {
                return mid;
                // System.out.println("the element to be searched1 ="+ mid);
            }
            if(arr[mid]>target)
            {
                max=mid-1;
                // System.out.println("the element to be searched ="+max);
            }
            else
            {
                min=mid+1;
                // System.out.println("the element to be searched ="+min);
            }
        }
        return -1;
       
    }
}
