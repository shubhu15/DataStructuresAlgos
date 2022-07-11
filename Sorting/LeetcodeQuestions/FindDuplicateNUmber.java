package Sorting.LeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNUmber {

//    https://leetcode.com/problems/find-the-duplicate-number/
    public int findDuplicate(int[] nums) {

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
                return nums[j];
        }

        return nums[nums.length-1];
    }
    // included one loop and 2 checks
    public int findDuplicate2(int[] nums) {
        //using cyclic sort
        int i = 0;
        while (i < nums.length) {

            if(nums[i]!= i+1){
                int correct = nums[i] - 1;
                if (nums[correct] != nums[i])
                    swap(nums, i, correct);
                else
                    return nums[i];

            }

            else
                i++;

        }

        return -1;

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
