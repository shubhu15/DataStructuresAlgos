package Search.LeetCodeQuestions;

public class PeakInMountain {

//    https://leetcode.com/problems/peak-index-in-a-mountain-array/
//    https://leetcode.com/problems/find-peak-element/

    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArrayIMPORTANT(new int[]{3,5,3,2,0}));
    }


    // this gives index out of bounds exception if the greater element is at the end/start indexes
    public static int peakIndexInMountainArray(int[] nums) {

        int start=0;
        int end =nums.length-1;

        // find the last occurrence
        while (start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid+1]> nums[mid])
                start = mid +1;
            else if(nums[mid-1]> nums[mid])
                end= mid-1;

            else
                return mid; // if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){

        }

        return -1;

    }

    public static int peakIndexInMountainArrayIMPORTANT(int[] nums) {

        int start=0;
        int end =nums.length-1;

        // find the last occurrence
        while (start<end){

            int mid = start + (end-start)/2;

            if(nums[mid+1]> nums[mid])
                start = mid +1; //in the increasing part of array so greater is at mid+1
            else if(nums[mid+1]<nums[mid])
                end= mid; //in decreasing part of array,
            // look left to find more but this can be the ans
        }

        // in the end start = end
        return start;

    }
}
