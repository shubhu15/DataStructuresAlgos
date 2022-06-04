package Array.Recursion;

class RunningArraySum {
//    https://leetcode.com/problems/running-sum-of-1d-array/submissions/
    public static void main(String[] args) {
        RunningArraySum rm = new RunningArraySum ();
        int[] arr =rm.runningSum (new int[]{1, 2,3,5,6});

        for(int i : arr)
            System.out.println (i);
    }
    public int[] runningSum(int[] nums) {

//         for(int i=1;i<nums.length;i++){

//             nums[i]=nums[i]+nums[i-1];
//         }

        sum(nums,nums.length-1);
        return nums;

    }

    void sum(int[] nums, int s){
        if(s==0)
            return;
        sum(nums,s-1);
        nums[s] +=nums[s-1];

    }


}