public class dsa
{
    public static void main(String[] args){
        for (int i = 1; i <=5; i++)
        {
            for (int x = 5; x>i; x--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++)
            {
                System.out.print(j);
            } 
            System.out.println();
        }
    


           
        // int n=5;
        // for(int i=1; i<=n; i++)
        // {
        //     for(int j=1; j<=n; j++){
        //         if(j<=(n-i)+1){
        //             System.out.print(j);
        //         }
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }




        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (j <= n - i) {
        //             System.out.print(" "); // Print spaces
        //         } else {
        //             System.out.print(j - (n - i)); // Print numbers
        //         }
        //     }
        //     System.out.println();
        // }


        // floyd.triangle
        // int n=5;
        // int counter = 1;
        // for(int i=1; i<=n; i++)
        // {
        //     for(int j=1; j<=i; j++){
        //         System.out.print(counter +" ");
        //         counter++;
        //     }
        //     System.out.println();
        // }

        // bottom left triangle
        // int n=5;
        // for(int i=1; i<=n; i++)
        // {
        //     for(int j=1; j<=n; j++){
        //         if(i-j>=0){
        //             System.out.print("*");
        //         }
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

    }
}