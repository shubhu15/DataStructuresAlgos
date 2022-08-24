package Recursion.Array.Easy;

import java.util.ArrayList;

public class SubsetSum {

//    https://practice.geeksforgeeks.org/problems/subset-sums2234/1
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){

        ArrayList<Integer> ans = new ArrayList<>();
        // code here
        helperSubsetSum(arr, 0, ans, 0);

        return ans;

    }
    void helperSubsetSum(ArrayList<Integer> arr, int i, ArrayList<Integer> ans, int sum){

        if(i== arr.size()){
            ans.add(sum);
            return;
        }

        sum +=arr.get(i);
        helperSubsetSum(arr, i+1, ans, sum);
        sum -=arr.get(i);
        helperSubsetSum(arr, i+1, ans, sum);


    }
}
