package Recursion.MazeQuestions;

public class CountPathStartToEnd {

    public static void main(String[] args) {

        System.out.println(countPathInMaze(3, 3));
    }

    //    Q1 - FROM BACKTRACKING VIDEO
    private static int countPathInMaze(int r, int c) {

        if(r==1 || c==1)
            return 1;

        int count =0;
        int left = countPathInMaze(r-1,c);
        int right = countPathInMaze(r, c-1);
        count +=left+right;
        return count;
    }
}
