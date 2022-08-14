package Array.Array2D;

public class SetMatrixZeros {

//    https://leetcode.com/problems/set-matrix-zeroes/
    public void setZeroes(int[][] matrix) {
        int col=1;

        int rows = matrix.length;
        int colm = matrix[0].length;

        for(int i =0; i< rows; i++){

            if (matrix[i][0] ==0)
                col=0;
            for(int j =1 ; j< colm ; j++){
                if(matrix[i][j] ==0){
                    matrix[0][j] =0;
                    matrix[i][0] =0;
                }

            }
        }

        for(int i =rows-1; i>=0; i--){

            for(int j =colm-1 ; j>=1 ; j--){
                if(matrix[i][0] ==0 || matrix[0][j] ==0 ){
                    matrix[i][j] =0;
                }

            }

            if(col==0)
                matrix[i][0]=0;
        }


    }
}
