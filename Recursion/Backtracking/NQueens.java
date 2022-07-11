package Recursion.Backtracking;

public class NQueens {

//    https://www.youtube.com/watch?v=nC1rbW2YSz0&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=36

//    Q1 - NQueens problem
    public static void main(String[] args) {

        boolean[][] board = new boolean[4][4];
        System.out.println(NQueensCountPath(board, 0));
    }

    public static int NQueensCountPath(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count =0;
        for(int col = 0;col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += NQueensCountPath(board,row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // check vertical row
        for(int i =0; i< row;i++){
            if(board[i][col])
                return false;
        }

        // diagonal left
        int maxLeft = Math.min(row,col);
        for(int i=1; i<=maxLeft;i++)
        {
            if(board[row-i][col-i])
                return false;
        }

        // diagonal right
        int maxRight = Math.min(row,board.length-col-1);
        for(int i=1; i<=maxRight;i++)
        {
            if(board[row-i][col+i])
                return false;
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] r : board){
            for (boolean v : r){
                if(v)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }

    }
}
