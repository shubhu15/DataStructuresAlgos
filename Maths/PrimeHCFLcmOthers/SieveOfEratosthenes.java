package Maths.PrimeHCFLcmOthers;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int a =40;
        boolean[] temp = new boolean[a+1]; //as i want to include 40 as well
        sieve(a,temp);

    }
//false value means it is prime no
    private static void sieve(int a , boolean[] temp) {

        for(int i =2;i*i<=a;i++){

            if(!temp[i]){
                for(int j =i*2; j<=a;j+=i)
                    temp[j]=true;
            }

        }

        for(int i =2;i<=a;i++)
            if(!temp[i])
                System.out.println (i);
    }
}
