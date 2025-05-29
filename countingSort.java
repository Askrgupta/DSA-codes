public class countingSort {
    public static void main(String args[])
    {
        int arr []={1,4,1,3,2,4,3,7};
        counting(arr);
        printAry(arr);

    }
    public static void counting(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }
    
        int count[] = new int[largest+1]; //because we are starting from 0
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++; //arr[i] ko index ki tarah lena hai aur count mai us index par jana hai aur us number ko kar dena ++

        }
        // sorting
        int j=0;
        for(int i=0; i<count.length; i++){ //count is frequency wala array
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printAry(int arr[])
    {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }
}
