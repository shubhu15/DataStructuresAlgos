package Maths.BitWiseOp;

public class RangeABXOR {
// to find the XOR of range a to b

    public static void main(String[] args) {

        int a =3 ,b=9;
        System.out.println (xor (9)^xor (2));
    }
    static int xor(int a){

        if(a% 4 ==0)
            return a;
        if(a% 4 ==1)
            return 1;
        if(a% 4 ==2)
            return a+1;

        return 0;
    }

}
