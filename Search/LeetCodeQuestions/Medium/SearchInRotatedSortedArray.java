package Search.LeetCodeQuestions.Medium;

public class SearchInRotatedSortedArray {

    // TODO: 04-07-2022 - check the recursive version
//    https://leetcode.com/problems/search-in-rotated-sorted-array/
    public int search(int[] nums, int target) {

        int pivot = getPivot(nums);
        if(pivot==-1)
            return getBinarySearch(nums, target,0, nums.length-1);
        if(nums[pivot]==target)
            return pivot;

        int fm = getBinarySearch(nums, target, 0, pivot-1);

        if(fm!=-1)
            return fm;

        return getBinarySearch(nums, target, pivot+1, nums.length-1);


    }

    public int getBinarySearch(int[] nums, int target, int start, int end){

        int ans =-1;
        while(start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid]==target)
            {return mid;}
            else if(target>nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }

        return ans;

    }

    public int getPivot(int[] nums){
        int start =0;
        int end = nums.length-1;

        if(end==0)
            return 0;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid <end && nums[mid]>nums[mid+1])
                return mid;
            else if(mid > start && nums[mid] <nums[mid-1])
                return mid-1;
            else if(nums[start]> nums[mid])
                end =mid-1;
            else if(nums[start]<=nums[mid])
                start =mid +1;
        }

        return -1;
    }
}
