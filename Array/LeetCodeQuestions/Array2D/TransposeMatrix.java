package Array.LeetCodeQuestions.Array2D;

public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for(int i =0; i<matrix.length; i++){
            for(int j =0;j<matrix[0].length;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

//    using swap temp for in-place swapping-- for a square matrix
    public int[][] transpose2(int[][] matrix) {
        int n = matrix.length;

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) { // to avoid swapping twice and "+1" is there since we can skip the diagonals as well
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }
}
