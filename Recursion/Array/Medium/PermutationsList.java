package Recursion.Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class PermutationsList {

//    https://leetcode.com/problems/permutations/
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        helper(nums, ans, new ArrayList<>(), map);
        return ans;
    }

    void helper(int[] n, List<List<Integer>> ans, List<Integer> ds, boolean[] map ){

        if(ds.size() == n.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i =0;i<n.length; i++){
            if(!map[i]){

                ds.add(n[i]);
                map[i]= true;
                helper(n, ans, ds,map);
                map[i]=false;
                ds.remove(ds.size()-1);
            }

        }
    }
}
