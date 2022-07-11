package Sorting.LeetcodeQuestions;

public class MissingNumberCyclicSort {

//    https://leetcode.com/problems/missing-number/
    public int missingNumber(int[] nums) {

        //using cyclic sort
        int i =0;
        while(i< nums.length){

            int correct = nums[i];
            if(nums[i]!=nums[correct] && nums[i]!=nums.length)
                swap(nums, i, correct);
            else
                i++;

        }

        for(int j =0; j<nums.length;j++){
            if(nums[j]!=j)
                return j;
        }

//        case 2
        return nums.length;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
