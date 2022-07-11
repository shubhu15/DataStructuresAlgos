package Sorting.LeetcodeQuestions;

public class SetMisMatch {

//    https://leetcode.com/problems/set-mismatch/
    public int[] findErrorNums(int[] nums) {

        //using cyclic sort
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
                return new int[]{nums[j], j+1};
        }

        return new int[]{-1,-1};

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
