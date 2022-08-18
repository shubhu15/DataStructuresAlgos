package Search.LeetCodeQuestions.Medium;

public class MinimumRotatedSortedArray {

//    https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    public int findMin(int[] nums) {

        int s =0;
        int e = nums.length-1;
        int p =-1;

        while(s<=e){

            int mid = s+(e-s)/2;

            if(mid<e && nums[mid]> nums[mid+1])
            {
                p= mid;
                break;
            }
            else if(mid>s && nums[mid-1]>nums[mid])
            {
                p =mid-1;
                break;
            }
            else if(nums[s]<=nums[mid])
                s= mid+1;
            else
                e=mid-1;

        }
        return nums[p+1];
    }
}
