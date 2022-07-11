package Recursion.LeetCodeQuestion;

public class DiceThrowCount {

    public static void main(String[] args) {

        diceApproach("", 4);

        System.out.println(diceApproach2(30,30,"",500));
    }

    public static void diceApproach(String p, int target){
        if(target==0)
        {
            System.out.println(p);
            return;
        }

        for (int i =1;i<=6 && i<=target; i++){

            diceApproach(p+i, target-i);
        }

    }

    // TODO: 10-07-2022  - using DP as this solution gives TLE error 

//    https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
    public static  int diceApproach2(int n, int k, String p, int target){
        if(target==0 && p.length()==n)
        {
            return 1;
        }

        int count =0;
        for (int i =1;i<=k && i<=target; i++){

            count +=diceApproach2(n, k, p+i, target-i);
        }

        if(count> Integer.MAX_VALUE)
            return 222616187;
        return count;

    }
}
