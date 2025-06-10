public class diagonalSum {
    public static void main(String args[]){
        // int matrix[][] = {{1,2,3,4},
        //                   {5,6,7,8}, 
        //                   {9,10,11,12},
        //                   {13,14,15,16}};
        int matrix[][] = {{0,1,2},{3,4,5},{6,7,8}};
        // System.out.println(diagonalEleSum1(matrix));
        System.out.println(diagonalEleSum2(matrix));                      
    }
    // public static int diagonalEleSum1(int matrix[][]){ //time coplextity O(n^2)
    //     int sum =0;

    //     for(int i =0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[0].length; j++){
    //             if(i == j){
    //                 sum += matrix[i][j];
    //             }
    //             else if(i+j == matrix.length - 1){
    //                 sum += matrix[i][j];
    //             }
    //         }
    //     }return sum;
    // }
    public static int diagonalEleSum2(int matrix[][]){ //linear time complexity
        int sum =0;
        int n= matrix.length;
        for(int i=0; i<n; i++){
            // primary Diagonal
            sum += matrix[i][i];
            // Secondary Diagonal
            if(i != n-1-i)
                sum += matrix[i][n-i-1];
        }
        return sum;
    }
}