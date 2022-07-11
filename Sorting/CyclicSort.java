package Sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSorting(int[] arr) {

        int i=0 ;
        while( i< arr.length){

            int correct = arr[i]-1;
           if (arr[correct] !=arr[i]){
               swap(arr, i, correct);
           }
           else
               i++;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
