package Array.Recursion;

public class Nto1 {

    public static void main(String[] args) {
        printN(30);
    }

    private static void printN(int i) {
        if(i==0)
            return;
        System.out.println (i); // print 30 to 1
        printN (i-1);
//        System.out.println (i); prints 1 to 30

    }
}
