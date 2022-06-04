package Maths.PrimeHCFLcmOthers;

public class GCDNumbers {

    public static void main(String[] args) {
        System.out.println (gcd(4,10));
        System.out.println (lcm(4,10));
    }

    private static int gcd(int i , int i1) {
        if(i==0)
            return i1;
        return gcd (i1%i,i);
    }

    static int lcm(int a , int b){
        return a*b/gcd (a,b);
    }
}
