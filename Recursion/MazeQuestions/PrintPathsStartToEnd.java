package Recursion.MazeQuestions;

import java.util.ArrayList;
import java.util.List;

public class PrintPathsStartToEnd {

    public static void main(String[] args) {

        System.out.println(printPathInMazeList("",3, 3));
    }

    //    Q2 - FROM BACKTRACKING VIDEO
    private static void printPathInMaze(String p,int r, int c) {

        if(r==1 && c==1) {
            System.out.println(p);
            return;
        }

        if(r!=1)
            printPathInMaze(p+"D",r-1,c);
        if(c!=1)
            printPathInMaze(p+"R",r,c-1);
    }

    private static ArrayList<String> printPathInMazeList(String p, int r, int c) {

        if(r==1 && c==1) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r!=1)
            ans.addAll(printPathInMazeList(p+"D",r-1,c));
        if(c!=1)
            ans.addAll(printPathInMazeList(p+"R",r,c-1));

        return ans;
    }
}
