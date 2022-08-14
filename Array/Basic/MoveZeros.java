package Array.Basic;

public class MoveZeros {

//    https://leetcode.com/problems/move-zeroes/
    public void moveZeroes(int[] nums) {

        int len = nums.length;
        if(len<2)
            return;

        int i =0;
        int j =1;

        while(j<len){
            if(nums[j]!=0 && nums[i]==0){
                nums[i] =nums[j];
                nums[j] =0;
                i++;
                j++;
            }
            else if(nums[j]==0 && nums[i]==0)
                j++;
            else
            {i++;j++;}

        }
    }

}
