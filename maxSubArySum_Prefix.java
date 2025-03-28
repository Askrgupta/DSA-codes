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
        int n=5;
        // int totalSubary=0;
        for(int i=0; i<n;i++)
        {
            for(int j=i;j<n;j++)
            {   currSum=0;
                for(int k=i;k<=j;k++)
                {
                    currSum += arr[k];
                }
                System.out.println(currSum);
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
