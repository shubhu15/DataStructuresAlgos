package Search.LeetCodeQuestions.Medium;

public class FirstLastPositionTarget {
//    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    //BRUTE FORCE
    public int[] searchRange(int[] nums, int target) {

        if(nums.length==0)
            return new int[]{-1,-1};

        int start =-1;
        int end =-1;

        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]== target)
            {
                start=i;
                break;

            }
        }

        for(int j =nums.length-1;j>=0;j--)
        {
            if(nums[j]== target)
            {
                end=j;
                break;

            }
        }

        return new int[]{start,end};
    }

// BINARY SEARCH APPROACH
    public int[] searchRangeBinary(int[] nums, int target) {

        if(nums.length==0)
            return new int[]{-1,-1};

        int first =-1;
        int last =-1;

        // to find the first occurrence
       first = search(nums,target,true);

       if(first!= -1)
       last = search(nums,target,false);

         // find the last occurrence


        return new int[]{first,last};

    }

    int search(int[] nums, int target, boolean isStart){
        int ans=-1;
        int start=0;
        int end =nums.length-1;

        // find the last occurrence
        while (start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid]==target){
                ans=mid;
                if(isStart)
                    end= mid-1;
                else
                    start= mid+1;
            }
            else if(target>nums[mid])
                start= mid+1;
            else if(target<nums[mid])
                end= mid-1;

        }

        return ans;
    }

}
