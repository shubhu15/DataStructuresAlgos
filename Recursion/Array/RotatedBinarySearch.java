package Recursion.Array;

public class RotatedBinarySearch {

    public static void main(String[] args) {

//        int[] arr = {4,5,6,7,1,2,3};
        int [] arr ={5,1,3};
        System.out.println(checkBinarySearch(arr,0,0,arr.length-1));
    }
    static int checkBinarySearch(int[] arr, int target, int s, int e){

        if(s>e)
            return -1;

        int mid = s+(e-s)/2;
        if(arr[mid] == target)
            return mid;

        if(arr[s]<=arr[mid]){

            if(target>=arr[s] && target <= arr[mid])
                return checkBinarySearch(arr,target,s,mid-1);
            else
                return checkBinarySearch(arr,target,mid+1,e);
        }

        if(target >= arr[mid] && target <= arr[e]){
            return checkBinarySearch(arr,target,mid+1, e);
        }
        else
            return checkBinarySearch(arr,target,s, mid-1);
    }

}
