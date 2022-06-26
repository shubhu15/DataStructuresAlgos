package Recursion.Basic;

public class ReverseNumber {

    public static void main(String[] args) {
        reverseNumber(123);
        reverseNumber2(123);
        System.out.println();
        System.out.println(sum);
//        System.out.println();
        System.out.println(reverseNumber3(123));
        //using helper function if need additional variable in the original function
    }

    private static int reverseNumber3(int i) {
        int digits = (int)(Math.log10(i))+1;
        return helper(i, digits);
    }

    private static int helper(int i, int digits) {
        if(i%10==i)
            return i;
        return i%10* (int)Math.pow(10, digits-1)+helper(i/10,digits-1);

    }

    static int sum =0;
    private static void reverseNumber2(int i) {
        if(i==0)
            return;
        sum = sum *10 + (i%10);
        reverseNumber2(i/10);

    }

    private static void reverseNumber(int i) {
        if(i==0)
            return;
        System.out.print(i%10);

        reverseNumber(i/10);

    }
}
