package Recursion.Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

//    https://leetcode.com/problems/combination-sum/
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    void helper(int[] c,int t,int i,List<Integer> ds ,
                List<List<Integer>> ans){

        if(i== c.length){
            if(t==0)
                ans.add(new ArrayList<>(ds));
            return ;
        }


        if(c[i]<=t){
            ds.add(c[i]);


            helper(c, t-c[i], i, ds, ans);

            ds.remove(ds.size()-1);

        }

        helper(c, t,i+1, ds,ans);

    }
}
