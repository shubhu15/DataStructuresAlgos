package Recursion.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

//    https://leetcode.com/problems/combination-sum-ii/
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);

        helper(candidates, 0, target, ans, new ArrayList<>());

        return ans;
    }

    void helper(int[] c, int index , int t, List<List<Integer>> ans, List<Integer> ds ){



        if(t ==0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = index; i<c.length; i++){

            if(c[i]>t)
                break;
            if(i> index && c[i]==c[i-1])
                continue;
            else
            {
                ds.add(c[i]);
                helper(c, i+1, t-c[i], ans, ds);
                ds.remove(ds.size()-1);
            }
        }

    }
}
