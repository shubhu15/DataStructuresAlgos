package Sorting.LeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumber {

//    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //using cyclic sort
        int i =0;
        while(i< nums.length){

            int correct = nums[i]-1;
            if(nums[correct]!=nums[i] )
                swap(nums, i, correct);
            else
                i++;

        }

        List<Integer> ans = new ArrayList();
        for(int j =0; j<nums.length;j++){
            if(nums[j]-1!=j)
                ans.add(j+1);
        }

        return ans;
    }


    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
