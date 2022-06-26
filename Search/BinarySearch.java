package Search;

public class BinarySearch {

    public int search(int[] nums, int target) {

        return searchBin(nums, target, 0, nums.length-1);
    }

    public int searchBin(int[] nums, int target, int start, int end){
        if(start>end)
            return -1;
        int mid = start + ( end - start)/2;
        if(nums[mid] == target)
            return mid;
        else if(nums[mid]>target)
            return searchBin(nums, target, start, mid-1);
        else
            return searchBin(nums, target, mid+1, end);
    }
}
