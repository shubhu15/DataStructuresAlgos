package Maths.PrimeHCFLcmOthers;

public class BinarySquareRoot {

    public static void main(String[] args) {
        int n =40;
        int precision =3;
        System.out.println (squareroot(n,precision));
    }
//O(logN)
    private static double squareroot(int n , int precision) {
        double root =0.0;
        int s =1;
        int e =n;

        while(s<=e){
            int mid = s+ (e-s)/2;

            if(mid*mid ==n)
                return mid;

            if(mid*mid >n)
                e=mid-1;
            else
                s=mid+1;
        }
        double incr=0.1;
        for(int i=0; i<precision;i++){
            while (root*root<=n){
                root +=incr;
            }
            root -=incr;
            incr=incr/10;
        }
        return root;
    }
}
