package Recursion.Backtracking;

import java.util.Arrays;

public class PrintPathMatrixAllPaths {

    public static void main(String[] args) {

        boolean[][] bool = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        printAllPathsWithPathMatrix("",0, 0, bool, path,1);
    }

    //    Q6 - FROM BACKTRACKING VIDEO
    private static void printAllPathsWithPathMatrix(String p, int r, int c, boolean[][] booleanMatrix,
                                                                 int[][] path, int step)
    {
        if(!booleanMatrix[r][c])
            return ;

        if(r==booleanMatrix.length-1 && c==booleanMatrix[0].length-1) {
            path[r][c] = step;
            for (int[]  a : path)
                System.out.println(Arrays.toString(a));

            System.out.println(p);
            System.out.println();
            return ;
        }

        booleanMatrix[r][c] = false; //visited cell
        path[r][c]=step;
        if(r<booleanMatrix.length-1)
            printAllPathsWithPathMatrix(p+"D",r+1,c,booleanMatrix,path,step+1);
        if(c<booleanMatrix[0].length-1)
            printAllPathsWithPathMatrix(p+"R",r,c+1,booleanMatrix,path,step+1);
        if(c>0)
            printAllPathsWithPathMatrix(p+"L",r,c-1,booleanMatrix,path,step+1);
        if(r>0)
            printAllPathsWithPathMatrix(p+"U",r-1,c,booleanMatrix, path,step+1);


        booleanMatrix[r][c] = true; // reverting the changes when returning from the function call -- marking again not visited
        path[r][c] = 0;

    }
}
