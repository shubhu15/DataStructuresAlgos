package SlidingWindow.GeeksForGeeks;

import java.util.ArrayList;

public class MaximumSumSubArrayKSize {

//    https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        // code here

        int i =0;
        int j =0;
        long maxsum = Integer.MIN_VALUE;
        long sum =0;

        while(j<N){
            sum += Arr.get(j);

            if((j-i+1)< K)
                j++;

            else if((j-i+1) == K)
            {
                maxsum = Math.max(maxsum, sum);
                sum -= Arr.get(i);
                i++;
                j++;

            }


        }

        return maxsum;
    }
}
