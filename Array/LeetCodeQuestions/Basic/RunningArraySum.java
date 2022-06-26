package Array.LeetCodeQuestions.Basic;

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

//    other solution with recursion
    public int[] runningSum2(int[] nums) {


        runningSumHelper(nums, 1);

        return nums;
    }

    public void  runningSumHelper(int[] nums,int i){
        if(i==nums.length)
            return ;
        nums[i] = nums[i-1]+nums[i];
        runningSumHelper(nums, i+1);


    }


}