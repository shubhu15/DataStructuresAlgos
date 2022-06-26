package Array.LeetCodeQuestions.Array2D;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix {
//    https://leetcode.com/problems/lucky-numbers-in-a-matrix/

//    my solution -- not optimum
    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> ls = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        // HashSet<Integer> hs = new HashSet<>();

        for(int i =0; i<matrix.length  ; i++){
            int min = Integer.MAX_VALUE;
            for(int j =0;j< matrix[i].length ;j++){
                if(min> matrix[i][j])
                    min = matrix[i][j];


            }
            System.out.println("min:" +min);
            ls.add(min);
        }

        for(int k=0; k<matrix[0].length;k++){
            int max = Integer.MIN_VALUE;
            for(int l =0;l<matrix.length ;l++){

                if(max< matrix[l][k])
                    max = matrix[l][k];

            }
            System.out.println("max:" +max);
            if(ls.contains(max))ls2.add(max);

        }
        return ls2;


    }

//    optimum solution
    public List<Integer> luckyNumbers2 (int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();

        for (int row = 0; row < matrix.length; row++) {
            int minCol = minColInRow(matrix, row);
            int value = matrix[row][minCol];
            if (checkIfMaxInCol(matrix, minCol, value)) {
                result.add(value);
            }
        }

        return result;
    }

    private int minColInRow(int[][] matrix, int row) {
        int minIndex = 0, min = matrix[row][minIndex];
        for (int col = 1; col < matrix[row].length; col++) {
            if (matrix[row][col] < min) {
                min = matrix[row][col];
                minIndex = col;
            }
        }
        return minIndex;
    }

    private boolean checkIfMaxInCol(int[][] matrix, int col, int value) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] > value) return false;
        }
        return true;
    }
}
