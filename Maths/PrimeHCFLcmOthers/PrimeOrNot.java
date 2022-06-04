package Maths.PrimeHCFLcmOthers;

public class PrimeOrNot {

    public static void main(String[] args) {
        int a =13;
        System.out.println (isPrime (a));

    }
    static boolean isPrime(int a){

        if(a<=1)
            return false;
        int c=2;
        while(c*c<=a){
            if(a%c==0)
                return false;
            c++;
        }

        return true;
    }
}
