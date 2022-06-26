package Maths.BitWiseOp.LeetCodeQuestions;

public class SingleNumber {

//    https://leetcode.com/problems/single-number/
    public int singleNumber(int[] nums) {
        int ans =0;
        for(int i :nums){
            ans ^=i;
        }

        return ans;

    }
}
