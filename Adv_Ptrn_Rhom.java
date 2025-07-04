public class Adv_Ptrn_Rhom {
    public static void main(String[] args) {
        // solidRhombus(7);
        hollowRhombus(7);
    }
    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }    
    }
    
    // hollow Rhombus
    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }    
    }
}