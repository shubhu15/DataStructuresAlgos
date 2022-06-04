package Maths.PrimeHCFLcmOthers;

public class NewtonSquareRoot {


    public static void main(String[] args) {
        int a =40;
        System.out.println (squrt(a));
    }

    private static double squrt(int a) {
        double x =a;
        double root=0;
        while(true){
            root = 0.5 *(x +a/x);

            if(Math.abs (root-x)<1)
                break;
            x=root;
        }

        return root;
    }
}
