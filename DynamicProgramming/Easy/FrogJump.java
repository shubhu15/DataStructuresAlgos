package DynamicProgramming.Easy;

public class FrogJump {

//    https://www.codingninjas.com/codestudio/problems/frog-jump_3621012?leftPanelTab=0
    //recursion
    public static int frogJump(int n, int heights[]) {

        return recur(n-1, heights);

    }

    public static int recur (int i , int[] heights){

        if(i==0)
            return 0;

        int left = recur(i-1, heights) + Math.abs(heights[i]-
                heights[i-1]);
        int right = Integer.MAX_VALUE;
        if(i >1)
            right = recur(i-2, heights)+ Math.abs(heights[i]-
                    heights[i-2]);

        return Math.min(left, right);
    }

    public static int frogJump_memoization(int n, int heights[]) {
        int[] dp = new int[n+1];

        for(int i=0; i<=n;i++){
            dp[i]=-1;
        }
        return recur_memoization(n-1, heights, dp);

    }

    public static int recur_memoization (int i , int[] heights, int[] dp){

        if(i==0)
            return 0;
        if(dp[i]!=-1)
            return dp[i];

        int left = recur_memoization(i-1, heights, dp) + Math.abs(heights[i]-
                heights[i-1]);
        int right = Integer.MAX_VALUE;
        if(i >1)
            right = recur_memoization(i-2, heights, dp)+ Math.abs(heights[i]-
                    heights[i-2]);
        dp[i] = Math.min(left, right);
        return dp[i];
    }

    public static int frogJump_TABULATION(int n, int heights[]) {
        int[] dp = new int[n];

        dp[0] = 0;

        for(int i=1; i<n;i++){

            int left = dp[i-1] + Math.abs(heights[i]-
                    heights[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1)
                right = dp[i-2]+ Math.abs(heights[i]-
                        heights[i-2]);
            dp[i] = Math.min(left, right);

        }
        return dp[n-1];

    }

    public static int frogJump_SPACE_OPTIMIZATION(int n, int heights[]) {


        int prev2 = -1;
        int prev =0;

        for(int i=1; i<n;i++){

            int left = prev+ Math.abs(heights[i]-
                    heights[i-1]);
            int right = Integer.MAX_VALUE;
            if(prev2>=0)
                right = prev2+ Math.abs(heights[i]-
                        heights[i-2]);
            int curr = Math.min(left, right);
            prev2 = prev;
            prev = curr;

        }
        return prev;

    }
}
