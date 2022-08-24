package Array.Medium;

public class ProductArrayExceptSelf {

    // PREFIX SUM
//    https://leetcode.com/problems/product-of-array-except-self/
    public int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length-1] =1;

        for(int i =1; i<nums.length; i++)
            left[i] = left[i-1]*nums[i-1];

        for(int i =nums.length-2; i>=0; i--)
            right[i]= right[i+1]* nums[i+1];

        for(int i =0; i<nums.length; i++){
            left[i] = left[i]*right[i];
        }

        return left;

    }

    public int[] productExceptSelf_O_n_Space(int[] nums) {

        int[] right = new int[nums.length];


        right[nums.length-1] =1;

        int left =1;

        for(int i =nums.length-2; i>=0; i--)
            right[i]= right[i+1]* nums[i+1];

        for(int i =0; i<nums.length; i++){
            right[i] = left*right[i];
            left = left *nums[i];
        }

        return right;

    }
}
