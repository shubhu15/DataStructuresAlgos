package Recursion.Backtracking;

import java.util.ArrayList;

public class FindAllPathMoveInAllDirections {

    public static void main(String[] args) {

        boolean[][] bool = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(printAllPaths("",0, 0, bool));
    }

    //    Q5 - FROM BACKTRACKING VIDEO

    private static ArrayList<String> printAllPaths(String p, int r, int c, boolean[][] booleanMatrix)
    {
        if(!booleanMatrix[r][c])
            return new ArrayList<>() ;

        if(r==booleanMatrix.length-1 && c==booleanMatrix[0].length-1) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> ans = new ArrayList<>();

        booleanMatrix[r][c] = false; //visited cell
        if(r<booleanMatrix.length-1)
            ans.addAll(printAllPaths(p+"D",r+1,c,booleanMatrix));
        if(c<booleanMatrix[0].length-1)
            ans.addAll(printAllPaths(p+"R",r,c+1,booleanMatrix));
        if(c>0)
            ans.addAll(printAllPaths(p+"L",r,c-1,booleanMatrix));
        if(r>0)
            ans.addAll(printAllPaths(p+"U",r-1,c,booleanMatrix));


        booleanMatrix[r][c] = true; // reverting the changes when returning from the function call -- marking again not visited
        return ans;
    }
}
