public class SearchInRotatedSortedArray {

    public static int search(int arr[], int target, int si, int ei){
        // Base case
        if(si > ei){
            return -1;
        }

        // kaam
        int mid = si + (ei-si)/2;

        // Case Found
        if(arr[mid] == target){
            return mid;
        }

        // mid on Line 1
        if(arr[si] <= arr[mid]){
            // case A
            if(arr [si] <= target && target <=arr[mid]){
                return search(arr, target, si, mid-1);
            }
            else{
                // case B
                return search(arr, target,mid+1 , ei);
            }
        }

        // mid on L2
        else{
            // case C
            if( arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            else{
                // Case D
                return search(arr, target, si, mid-1);
            }

        }

    }
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int targetIdx = search(arr, target, 0, arr.length-1);
        System.out.println(targetIdx);
    }
}
