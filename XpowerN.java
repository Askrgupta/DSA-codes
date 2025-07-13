public class XpowerN {
    public static int xPowN(int x, int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = xPowN(x, n-1);
        // int xn = x*xnm1;
        // return xn;

        return x * xPowN(x, n-1);
    }


    public static int powerOptimized(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = powerOptimized(a, n/2);
        int halfPowerSq = halfPower*halfPower;

        // n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq; 
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(powerOptimized(2, 5));
    }
}
