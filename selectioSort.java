public class selectioSort {
    public static void main(String[]args){
        int arr []={8,6,4,2,1,0,5,3,7};
        selectiosort(arr);
        printAry(arr);
    }
    public static void selectiosort(int arr[]){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int smallest = i;//assuming the current element is the smallest element
            for(int j=i+1; j<=n-1;j++){
                if(arr[smallest]>arr[j]){//comparing whether array element at index "smallest" is greater than that of element in array at index j
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printAry(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }
}