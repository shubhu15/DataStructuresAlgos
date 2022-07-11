package Recursion.Patterns;

public class Triangle1 {

    public static void main(String[] args) {
        printTriangle2(5,0);
    }

    private static void printTriangle(int r, int c) {
        if(r==0)
            return;
        if(r<=c){
            System.out.println();
            printTriangle(r-1,0);
        }
        else {
            System.out.print("*");
            printTriangle(r,c+1);
        }
    }

    private static void printTriangle2(int r, int c) {
        if(r==0)
            return;
        if(r<=c){
            printTriangle2(r-1,0);
            System.out.println();
        }
        else {
            printTriangle2(r,c+1);
            System.out.print("*");
        }
    }
}
