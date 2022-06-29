package Search;


public class BSCeilingNumber {

    public static void main(String[] args) {
        System.out.println(binarySearchCeil(new int[]{1, 3, 4, 6,7,8,10}, 5));
    }

    private static int binarySearchCeil(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;

        while(start<=end){

        // if target number is greater than the greatest number in array --
            if(target>arr[arr.length-1])
                return -1;
            int mid = start + (end-start)/2;
            if(target>arr[mid])
                start= mid+1;
            else if(target<arr[mid])
                end= mid-1;
            else
                return arr[mid];
        }
//        as start= end+1 --> next greater element when the loop breaks
        return arr[start];
    }
}
