package Recursion.Sorting;

import java.util.Arrays;

public class SelectionSort {

      public static void main(String[] args) {
        int[] arr = {4,3,2,1};
          selectionSortRec(arr,3,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSortRec(int[] arr, int r, int c, int maxIndex) {
        if(r==0)
            return;
        if(r<=c){
            int swap = arr[c];
            arr[c] = arr[maxIndex];
            arr[maxIndex] = swap;
            selectionSortRec(arr,r-1,0,maxIndex);
        }
        else {
            if(arr[maxIndex]<arr[c]){
              maxIndex=c;
            }
            selectionSortRec(arr,r,c+1,maxIndex);
        }
    }
}
