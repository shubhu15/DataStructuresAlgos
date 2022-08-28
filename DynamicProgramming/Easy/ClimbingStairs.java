package DynamicProgramming.Easy;

public class ClimbingStairs {


    public int climbStairs(int n) {

        int[] dp = new int[n+1];

//        Arrays.fill(dp,-1); -- COULD BE USED
        for(int i=0; i<=n;i++){
            dp[i]=-1;
        }
        return dpClimb(n, dp);
        // return dp[n];

    }


    //MEMOIZATION
    int dpClimb(int n, int[] dp){

        if(n==0)
            return 1;
        if(n<0)
            return 0;

        if(dp[n]!=-1)
            return dp[n];

        dp[n] = dpClimb(n-1, dp) + dpClimb(n-2, dp);
        return dp[n];
    }


    public int climbStairs_TABULATION(int n) {

        int[] dp = new int[n+1];

        dp[0] =1;
        if(n==0)
            return 1;

        for(int i=1; i<=n;i++){
            int a;
            if(i-2 <0)
                a=0;
            else
                a=dp[i-2];
            dp[i]=dp[i-1]+a;
        }
        return dp[n];
        // return dp[n];

    }
}
