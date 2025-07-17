public class RecursionPQ {
    public static void main(String args[]){
        toh(3, 10, 30, 20);
    }
    public static void toh(int n, int A, int C, int B){
        if(n == 0){
            return;
        }
        toh(n-1, A, B, C);
        System.out.println("moving disk " +n +" from " +A + " to " + C);
        toh(n-1, B, C, A);
    }
}
