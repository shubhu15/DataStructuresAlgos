package Array.LeetCodeQuestions.Basic;

public class PivotIndex {

//    https://leetcode.com/problems/find-pivot-index/
//    my solution
    public int pivotIndex(int[] nums) {

        if(nums.length==0 )
            return -1;
        else if( nums.length==1)
            return 0;

        else{
            int n = nums.length;
            int[] leftsum = new int[n];
            int[] rightsum = new int[n];
            leftsum[0] =0;

            for(int i=1;i<n;i++){
                leftsum[i] = leftsum[i-1] + nums[i-1];
            }
            rightsum[n-1] =0;
            for(int i=n-2;i>=0;i--){
                rightsum[i] = rightsum[i+1] + nums[i+1];
            }

            for(int i=0;i<n;i++)
                if(leftsum[i]==rightsum[i])
                    return i;

            return -1;

        }

    }

//    better approach
    public int pivotIndex2(int[] nums) {
        if(nums.length == 1) return 1;


        int totalsum = 0;
        for(int i = 0; i<nums.length; i++){
            totalsum += nums[i];// calculating total sum of array
        }

        int leftsum = 0;// initially left sum is 0
        for(int i = 0; i<nums.length;i++){
            totalsum = totalsum - nums[i];// this will act as rightsum now
            if(leftsum == totalsum) return i; //comparing right sum with left sum
            leftsum = leftsum + nums[i]; // moving forward and increasing left sum
        }
        return -1;// no such index exists then
    }
}
