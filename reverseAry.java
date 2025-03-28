public class reverseAry {
    public static void main(String[] args)
    {
        // int arr[]={10,20,30,40,50};
        // int n=5;
        // int rev[]=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     rev[n-1-i]=arr[i];
        // }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(rev[i]+" ");
        // }
        int number[]={2,4,6,8,10,12};
        revArray(number);
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
    public static void  revArray(int number[])
    {
        int start=0;
        int end= number.length-1;
        while(start<end)
        {
        // swaping
        int temp=number[end];
        number[end]=number[start];
        number[start]=temp;
        start++;
        end--;
        }
    }
}
