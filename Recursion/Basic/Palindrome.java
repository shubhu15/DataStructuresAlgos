package Recursion.Basic;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palinCheck(21));
    }

    private static boolean palinCheck(int i) {
        int x=0;
        int y=Integer.toString(i).length()-1;

        return helperPalin(Integer.toString(i),x,y);
    }

    private static boolean helperPalin(String i, int x, int y) {
        if(x>y)
            return true;
        if(i.charAt(x)!=i.charAt(y))
            return false;
        return helperPalin(i,x+1,y-1);


    }
}
