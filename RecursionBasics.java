public class RecursionBasics {
    public static void main(String args[]){
       int n=6; 
    //    printInc(n);
    //    System.out.println(calcFact(n));
    System.out.println(fib(n));
    }
    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int calcFact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 =calcFact(n-1);
        int fact= n * calcFact(n-1);
        return fact;
    }
    public static int nSum(int n){
        if(n == 1){
            return 1;
        }
        int nm1 = nSum(n-1);
        int sum = n + nSum(n-1);
        return sum;
    }
    public static int fib(int n){
        if(n == 0 ||n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
}
