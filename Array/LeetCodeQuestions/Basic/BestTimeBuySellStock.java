package Array.LeetCodeQuestions.Basic;

public class BestTimeBuySellStock {

//    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int profit=0, maxprofit=0;

        for(int i : prices){

            if(min>i)
                min =i;

            profit = i-min;
            if(maxprofit< profit)
                maxprofit = profit;

        }

        return maxprofit;
    }
}
