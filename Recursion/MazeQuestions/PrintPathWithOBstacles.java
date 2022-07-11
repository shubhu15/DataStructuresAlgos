package Recursion.MazeQuestions;

import java.util.ArrayList;

public class PrintPathWithOBstacles {

    public static void main(String[] args) {

        boolean[][] bool = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println(printPathInMazeWithObstaclesList("",0, 0, bool));
    }

    //    Q4 - FROM BACKTRACKING VIDEO
    private static ArrayList<String> printPathInMazeWithObstaclesList(String p, int r, int c, boolean[][] booleanMatrix)
    {
        if(!booleanMatrix[r][c])
            return new ArrayList<>() ;

        if(r==booleanMatrix.length-1 && c==booleanMatrix[0].length-1) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r<booleanMatrix.length-1)
            ans.addAll(printPathInMazeWithObstaclesList(p+"D",r+1,c,booleanMatrix));
        if(c<booleanMatrix[0].length-1)
            ans.addAll(printPathInMazeWithObstaclesList(p+"R",r,c+1,booleanMatrix));

        return ans;
    }
}
