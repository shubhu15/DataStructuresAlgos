package Recursion.Array.Medium;

public class NextPermutation {

//    https://leetcode.com/problems/next-permutation/
    public void nextPermutation(int[] nums) {


        if(nums == null || nums.length<=1)
            return;

        int i = nums.length -2;

        while(i>=0){
            if(nums[i]<nums[i+1])
                break;
            i--;
        }

        if(i>=0){
            int j = nums.length -1;
            while(j>=0){
                if(nums[j]> nums[i])
                    break;
                j--;
            }
            swap(nums, i , j);
        }
        // System.out.println(i);
        reverse(nums, i+1, nums.length-1);
    }

    void reverse(int[] nums, int i , int j){

        while(i<j){
            swap(nums, i , j);
            i++;
            j--;

        }

    }

    void swap(int[] n, int i, int j){

        int t= n[i];
        n[i] = n[j];
        n[j] = t;
    }
}
