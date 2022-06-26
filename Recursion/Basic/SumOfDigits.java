package Recursion.Basic;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(getSum(1001));
    }

    private static int getSum(int i) {
        if(i==0)
            return 0;
        return i%10 +getSum(i/10);

    }
}
