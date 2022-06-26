package Array.LeetCodeQuestions.Basic;

import java.util.HashMap;

class Solution {

//    https://leetcode.com/problems/two-sum/submissions/
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> hm = new HashMap<>();

        for(int i =0; i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                return new int[]{hm.get(nums[i]),i};

            hm.put(target-nums[i],i);
        }

        return null;
    }

    public static void main(String[] args) {

    }
}