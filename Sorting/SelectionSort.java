package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr ={1,6,3,5,2,9};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSorting(int[] arr) {

        for(int i =0; i<arr.length;i++){

            int last = arr.length-i-1; //last position
            int maxIndex = 0;

            for(int j =0;j<=last; j++){
               if(arr[maxIndex]<arr[j]) // find the index of max element for swapping with the last position
                   maxIndex=j;
            }

            int swap = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = swap;
        }
    }
}
