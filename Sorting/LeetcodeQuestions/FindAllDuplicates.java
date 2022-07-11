package Sorting.LeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
        //using cyclic sort

        List<Integer> ans = new ArrayList();
        int i = 0;
        while (i < nums.length) {

            int correct = nums[i] - 1;
            if (nums[correct] != nums[i])
                swap(nums, i, correct);

            else
                i++;

        }

        for(int j =0; j<nums.length;j++){
            if(nums[j]-1!=j)
                ans.add(nums[j]);
        }

        return ans;

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
