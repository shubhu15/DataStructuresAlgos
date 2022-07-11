package Patterns;

public class Pattern1 {

       /* 3.*****
            ****
            ***
            **
            *
            */

    public static void main(String[] args) {
        pattern3(5);
        pattern5(5);
    }

    static void pattern3(int n){

        for(int i =1;i<=n;i++){

            for(int j =n-i+1;j>0;j--)
                System.out.print("*");
            System.out.println("");
        }
    }
    /*
        4.  1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
*/
    static void pattern4(int n){

        for(int i =1;i<=n;i++){

            for(int j =1;j<=i;j++)
                System.out.print(j);
            System.out.println("");
        }
    }

    /*
        5.  *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *
            */

    static void pattern5(int n){

        for(int i =1;i<=2*n-1;i++){

            if(i<=n)
            for(int j =1;j<=i;j++)
                System.out.print("* ");
            else
                for(int j =1;j<=2*n-i;j++)
                    System.out.print("* ");
            System.out.println("");
        }
    }
}
