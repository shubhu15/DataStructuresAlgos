package Patterns;

public class Pattern18 {

/*
28.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
*/

    public static void main(String[] args) {
        pattern31(4);

    }

    static void pattern28(int n){

        for(int i =1;i<=2*n-1;i++){

            if(i<=n){
                for(int j =1;j<=n-i;j++)
                    System.out.print(" ");
                for(int j =1;j<=i;j++)
                    System.out.print("* ");

            }

            else{
                for(int j =1;j<=i-n;j++)
                    System.out.print(" ");
                for(int j =1;j<=2*n-i;j++)
                    System.out.print("* ");
            }

            System.out.println("");
        }
    }
/*

31.      4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
*/



    static void pattern31(int n){

//        n =2*n;
        for(int i =0;i<2*n-1;i++){
            for(int j =0;j<2*n-1;j++){

                int value =n- (Math.min(i, Math.min( 2*n-1-i,Math.min(j,2*n-1-j))));
                System.out.print(value+" ");
            }
            System.out.println("");
        }
    }




}
