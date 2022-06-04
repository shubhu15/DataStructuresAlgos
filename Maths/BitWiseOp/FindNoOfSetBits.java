package Maths.BitWiseOp;

public class FindNoOfSetBits {
    public static void main(String[] args) {

        int a = 45;
        System.out.println (Integer.toBinaryString (a));

        System.out.println (setBits(a));

    }

    private static int setBits(int a) {

        int count =0;

        while(a>0){
            count++;
            a -= (a & -a);
        }


        return count;
    }


}
