package Recursion.Basic;

public class StepsToZero {

    public static void main(String[] args) {
        System.out.println(new StepsToZero().numberOfSteps(2434));
    }
    public int numberOfSteps(int num) {
//        int steps =0;
//         while(num>0){
//             if(num%2==0)
//             {
//                 num /=2;

//             }
//             else
//                 num -=1;
//             steps++;
//         }

//         return steps;

        return countSteps(num);
    }

    int countSteps(int n){
        int steps=0;
        return helperCount(n, steps);
    }

    int helperCount(int n, int s){

        if(n==0)
            return s;
        if(n%2==0)
            return helperCount(n/2,s+1);
        else
            return helperCount(n-1, s+1);
    }
}
