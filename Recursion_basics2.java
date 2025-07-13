public class Recursion_basics2 {

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccur(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccur(arr, i+1, key);
    }

    public static int lastOccur(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccur(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String args[]){
        int arr[] ={8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 3;
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccur(arr, 0, 7));
        // System.out.println(lastOccur(arr, 0, 5));

    }
}
