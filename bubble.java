// this is for thr best case scenario that is when the array is already sorted then how to check the time complexity
public class bubble{
public static void main (String args[]){
        int arr[]={1,2,3,4,5};// 5,4,1,3,2
        bubbleS(arr);
        printArray(arr);
        
    }
    public static void bubbleS(int arr[]){
        int n = arr.length;
        boolean swaps=true;
        for(int turn=0; turn<n-1; turn++){
            // int swaps=0;
            for(int j=0; j<n-1-turn; j++)
            {
                if(arr[j]>arr[j+1]){
                    // swapping
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps = false;
                }
            }
            if(swaps == true)
            {
                System.out.println("Array is sorted");
                // break;
                // swaps++;
            }
            // System.out.println(swaps);
            
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

