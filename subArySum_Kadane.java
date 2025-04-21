public class subArySum_Kadane {
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
    public static void kadanes(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum =0;
        
        for(int i=0;i<arr.length;i++){
           currSum=currSum+arr[i];
           if(currSum<0){
            currSum=0;
           }
           maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("our maximum SubArray sum ="+" "+maxSum);
    }
}
