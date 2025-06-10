import java.util.*;
public class matrices2DArray {
    public static void main(String args[]){
        int matrix[][] = new int[2][2];
        int n=matrix.length, m= matrix[0].length;
        // search( matrix ,5);

        // for input
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // for output
        for(int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            } System.out.println();;
        }
        search( matrix ,5);

    }
    public static boolean search(int matrix[][], int key){
        for(int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++){
               if(matrix[i][j] ==key){
                System.out.println("found at cell(" + i + "," +j + ")");
                return true;
               }
            }  
        }
        System.out.println("key not found");
        return false;
    }
}
