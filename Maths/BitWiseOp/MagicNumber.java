package Maths.BitWiseOp;

public class MagicNumber {

//    to find nth magic number
    public static void main(String[] args) {
        int n =5;
        int i=1,res =0;

        while(n>0){
            res += (n&1)* Math.pow (5,i);
            n =n>>1;
            i++;
        }

        System.out.println (
                res
        );
    }
}
