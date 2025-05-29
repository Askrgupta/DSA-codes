public class bubbleSort {
    public static void main (String args[]){
        int arr[]={5,4,1,3,2};
        bubble(arr);
        printArray(arr);
        
    }
    public static void bubble(int arr[]){
        int n = arr.length;
        for(int turn=0; turn<n-1; turn++){ //this is for the number of turns
            for(int j=0; j<n-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
