package Recursion.Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {

//    https://leetcode.com/problems/subsets-ii/

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subsetsWithDupHelper(nums, 0, ans, new ArrayList<>());

        return ans;

    }

    void subsetsWithDupHelper(int[] nums, int i, List<List<Integer>> ans, List<Integer> ls){


        ans.add(new ArrayList<>(ls));

        for(int j =i; j<nums.length; j++){
            if(j!=i && nums[j]==nums[j-1])
                continue;

            ls.add(nums[j]);
            subsetsWithDupHelper(nums, j+1, ans, ls );
            ls.remove(ls.size()-1);


        }


    }
}
