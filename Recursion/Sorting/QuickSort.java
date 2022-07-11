package Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4,3,5,2,6,7,3,1,9,44};
        quickSortRecursion(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSortRecursion(int[] arr, int low, int high) {

        if(low>=high)
            return;

        int s = low, e =high;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];

        while(s<=e){

            while (arr[s]<pivot)
                s++;

            while (arr[e]>pivot)
                e--;

            if(s<=e){
//                swap
                int temp = arr[s];
                arr[s] =arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSortRecursion(arr,low, e);
        quickSortRecursion(arr, s,high);

    }
}
