public class insertionSort {
    public static void main(String args[]){
     int arr []={8,6,4,2,1,0,5,3,7};
        insertionSrt(arr);
        printAry(arr);
    }
    public static void insertionSrt(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev +1] = arr[prev];
                prev --;
            }
            // for insertion
            arr[prev+1] = curr;
        }
    }
    public static void printAry(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }
}
