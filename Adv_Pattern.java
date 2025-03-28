public class Adv_Pattern 
{
    public static void main(String[] args)
    {
        butterFlyPtrn(5);
    }

  public static void butterFlyPtrn(int n)
  {
//         for (int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=n; j++)
//             {
//                 if(i+j>=n+1 || i-j>=0)
//                 {  //
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }System.out.println();
//         }
   
// 1st half
    for (int i = 1; i <= n; i++) {
        // for stars
        for (int j = 1; j <= i; j++) 
        {
            System.out.print("*");
        }
        // Spaces- 2*(n-i)
        for (int j = 1; j <= 2 * (n - i) ; j++) 
        {
            System.out.print(" ");
        }

        // for stars
        for (int j = 1; j <= i; j++) 
        {
            System.out.print("*");
        }
        System.out.println();       
    }
    // 2nd half
    for (int i = n; i >=1; i--) {
        // for stars
        for (int j = 1; j <= i; j++) 
        {
            System.out.print("*");
        }
        // Spaces- 2*(n-i)
        for (int j = 1; j <= 2 * (n - i); j++) 
        {
            System.out.print(" ");
        }

        // for stars
        for (int j = 1; j <= i; j++) 
        {
            System.out.print("*");
        }
        System.out.println();
}
  }
}