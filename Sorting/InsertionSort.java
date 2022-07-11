package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr ={1,6,3,5,2,9};
        insertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSorting(int[] arr) {

        for(int i =0; i< arr.length-1; i++){

            for(int j =i+1; j>0; j--){

                if(arr[j]<arr[j-1])
                    swap(arr, j-1, j);

                else
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
