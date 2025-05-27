public class subAryMaxSum 
{
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
            {   currSum=0;//har baar jab surwat karenge naye array k saath to current sum ko initialize karenge 0 k saath kyuki ye value har baar chnage ho jayega
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
// es program mai hum subArray ka sum nikale hai aur jo sabse maximum subArray sum hai uske print kiye hai
// es program ka time complexity jda hai n^3 hai jo ki optimal solution nhi hai 