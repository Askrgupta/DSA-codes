public class subAry {
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        int n=5;
        // int totalSubary=0;
        // int currSum=0;
        for(int i=0; i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int currSum=0;
                for(int k=i;k<=j;k++)
                {
                    currSum+= arr[k]; //finds the sum of the subArray
                    System.out.print(arr[k]+" ");
                }
                // System.out.println(currSum);//prints the sum of the subArray
                System.out.println();
                // totalSubary++;
            }
        }
        // System.out.println("Total number of Subarray is ="+" "+ totalSubary);
    }
}
// es program mai hum SubArray nikale hai aur saare subArray ka sum nikale hai...