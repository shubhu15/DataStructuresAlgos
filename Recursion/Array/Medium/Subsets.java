package Recursion.Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

//    https://leetcode.com/problems/subsets/
static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(subsets(a));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        helperSubsets(nums, 0, new ArrayList<>());
        return ans;

    }

    static void helperSubsets(int[] nums, int i, List<Integer> arr){

        if(i== nums.length){
            ans.add(new ArrayList<>(arr)); // new Array is required as
            // arr is object so its value is changed everytime
            return;
        }

        arr.add(nums[i]);
        helperSubsets(nums, i+1, arr);
        arr.remove(arr.size()-1);
        helperSubsets(nums, i+1, arr);
        // System.out.println(arr);
    }
}
