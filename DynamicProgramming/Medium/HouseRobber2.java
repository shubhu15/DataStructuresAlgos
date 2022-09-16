package DynamicProgramming.Medium;

public class HouseRobber2 {

    public int rob(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n-1];

        if(n==1)
            return arr[0];
        for(int i =1;i<n; i++){
            temp[i-1] = arr[i];
        }

        int withoutFirst = robStart(temp);

        for(int i =0;i<n-1; i++){
            temp[i] = arr[i];
        }

        int withoutLast = robStart(temp);

        return Math.max(withoutLast, withoutFirst);
    }

    public int robStart(int[] arr) {
        int n = arr.length;
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
