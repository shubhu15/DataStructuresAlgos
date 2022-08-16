package Array.Array2D;

public class RotateImage {

//    https://leetcode.com/problems/rotate-image/
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // TRANSPOSE
        for(int i =0; i <n; i++){
            for(int j= i+1; j<n ; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]= t;
            }
        }

        // REVERSE EACH ROW
        for(int i =0; i<n; i++){
            reverse(matrix, i, n);
        }

    }

    void reverse(int[][] m, int i, int n){
        int j=0;
        int k = n-1;

        while(j<=k){
            int t = m[i][j];
            m[i][j] = m[i][k];
            m[i][k] = t;
            j++;
            k--;
        }
    }
}
