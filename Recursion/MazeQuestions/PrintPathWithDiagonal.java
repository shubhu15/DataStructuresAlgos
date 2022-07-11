package Recursion.MazeQuestions;

import java.util.ArrayList;

public class PrintPathWithDiagonal {

    public static void main(String[] args) {

        System.out.println(printPathInMazeListWithDiagonal("",3, 3));
    }

//    Q3 - FROM BACKTRACKING VIDEO
    private static ArrayList<String> printPathInMazeListWithDiagonal(String p, int r, int c) {

        if(r==1 && c==1) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r!=1)
            ans.addAll(printPathInMazeListWithDiagonal(p+"V",r-1,c));
        if(c!=1)
            ans.addAll(printPathInMazeListWithDiagonal(p+"H",r,c-1));
        if(r>1 && c>1)
            ans.addAll(printPathInMazeListWithDiagonal(p+"D",r-1,c-1));


        return ans;
    }
}
