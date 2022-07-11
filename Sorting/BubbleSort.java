package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {};
        bubbleSorting(arr);
    }

    private static void bubbleSorting(int[] arr) {

        boolean swapFlag ;
        for(int i =0; i< arr.length; i++){

            swapFlag = false;
            for(int j =1; j< arr.length-i ; j++){

                if(arr[j-1]>arr[j]){
                    int swap = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = swap;
                    swapFlag = true;
                }
            }

            if(!swapFlag) // if no swaps occur for a particular value of i.. it means the array is sorted
                break; // so O(N) complexity for sorted array
        }
    }
}
