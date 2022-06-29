package Search;

public class BSSearchInfiniteArray {

//    https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {

        System.out.println(getRange(new int[]{1,2,2,3,5,6,7,19,30,34,56,78,90,1010,2222,34545,9003939},1010));
    }

    public static int getRange(int[] nums, int target){

        int start =0;
        int end =1;

        // go to the range where the target actually exists so keep on doubling the range
        while(target>nums[end])
        {
            int newStart = end+1;

            //end = prev end + sizeOfBox *2
            end = end + (end-start+1)*2;
            start = newStart;
        }

        return search(nums,target,start,end);



    }

    static int search(int[] nums, int target, int start, int end){

        // find the last occurrence
        while (start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid]==target){
                return nums[mid];
            }
            else if(target>nums[mid])
                start= mid+1;
            else if(target<nums[mid])
                end= mid-1;

        }

        return -1;
    }
}
