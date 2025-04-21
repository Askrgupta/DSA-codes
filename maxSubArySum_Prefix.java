public class maxSubArySum_Prefix {
    public static void main(String args[])
    {
        int arr[]={1,-2,6,-1,3};
        arysum(arr);
    }
    public static void arysum(int arr[])
    {
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];


        prefix[0]=arr[0];
        // calculate the prefix sum
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {   currSum=i == 0 ? prefix[j] :prefix[j]-prefix[i-1];//i=start and j=end
                // for(int k=i;k<=j;k++)
                // {
                //     currSum += arr[k];
                // }
                // System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;           
                }
                // System.out.println();
                // totalSubary++;
            }
        }
        System.out.println("maximum sum =" + maxSum);
        // System.out.println("Total number of Subarray is ="+" "+ totalSubary);
    }     
}
