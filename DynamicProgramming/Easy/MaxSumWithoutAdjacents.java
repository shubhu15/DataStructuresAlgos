package DynamicProgramming.Easy;

import java.util.Arrays;

public class MaxSumWithoutAdjacents {

    int findMaxSum(int arr[], int n) {
        // code here

        return max(n-1, arr);
    }

    int max(int i , int[] arr){

        if(i==0)
            return arr[i];

        if(i<0)
            return 0;

        int pick = arr[i] + max(i-2, arr);
        int not_pick = max(i-1,arr);

        return Math.max(pick, not_pick);

    }


    int findMaxSum_MEMOIZATION(int arr[], int n) {
        // code here
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return max(n-1, arr, dp);
    }

    int max(int i , int[] arr, int[] dp){

        if(i==0)
            return arr[i];

        if(i<0)
            return 0;

        if(dp[i]!=-1)
            return dp[i];

        int pick = arr[i] + max(i-2, arr , dp);
        int not_pick = max(i-1,arr , dp);

        dp[i] =Math.max(pick, not_pick);
        return dp[i];

    }

    int findMaxSum_TABULATION(int arr[], int n) {
        // code here
        int[] dp = new int[n+1];
        dp[0] = arr[0];



        for(int i =1;i<n; i++){

            int a ;
            if(i-2<0)
                a=0;
            else
                a=dp[i-2];

            int pick = arr[i] + a;
            int not_pick = dp[i-1];

            dp[i] =Math.max(pick, not_pick);

        }

        return dp[n-1];
    }
}
