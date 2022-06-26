package Recursion.Basic;

public class CountZeros {

    public static void main(String[] args) {
        System.out.println(countZerosUsingRecursion(303003003));

    }

    private static int countZerosUsingRecursion(int i) {
        int c=0;
        return helperCount(i,c);
    }

    private static int helperCount(int i, int c) {
        if(i==0)
            return c;
        if(i%10 ==0)
            c +=1;
        return helperCount(i/10,c);
    }
}
