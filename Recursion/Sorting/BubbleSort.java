package Recursion.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubbleSortRec(arr,3,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortRec(int[] arr, int r, int c) {
        if(r==0)
            return;
        if(r<=c){
            bubbleSortRec(arr,r-1,0);
        }
        else {
            if(arr[c+1]<arr[c]){
                int swap = arr[c+1];
                arr[c+1] = arr[c];
                arr[c] = swap;
//                swapFlag = true;
            }
            bubbleSortRec(arr,r,c+1);
        }
    }
}
