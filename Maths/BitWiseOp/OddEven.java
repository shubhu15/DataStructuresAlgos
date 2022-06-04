package Maths.BitWiseOp;

public class OddEven {

    public static void main(String[] args) {
        int a = 4;
        System.out.println (isOdd(a));

    }

    private static boolean isOdd(int a) {
        return (a & 1)==1;

    }
}
