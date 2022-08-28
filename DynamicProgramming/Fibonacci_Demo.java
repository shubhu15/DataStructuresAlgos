package DynamicProgramming;

public class Fibonacci_Demo {

    public int fibo(int n){

        if(n<=1)
            return n;

        return fibo(n-1)+fibo(n-2);

    }

    public int fibo_memoization(int n, int[] dp){

        if(n<=1)
            return n;

        if(dp[n]!=-1)
            return dp[n];

        dp[n] = fibo_memoization(n-1, dp)+fibo_memoization(n-2, dp);

        return dp[n];

    }

    public int fibo_tabulation(int n){

        int[] dp = new int[n+1];

        dp[0]=0;

        if(n==0)
            return n;
        dp[1] = 1;

        for(int i =2; i<=n; i++){
            dp[i] = dp[i-1] +dp[i-2];

        }
        return dp[n];
    }

    public int fibo_noExtraSpace(int n) {

        int prev2=0;
        if(n==0)
            return n;
        int prev = 1;

        for(int i =2; i<=n; i++){
            int curr = prev +prev2;
            prev2 = prev;
            prev = curr;

        }
        return prev;
    }


}
