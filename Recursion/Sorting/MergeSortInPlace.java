package Recursion.Sorting;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {
        int[] arr = {5,3,2,1};
        mergeSortRecursionInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortRecursionInPlace(int[] arr, int start, int end) {
        if(end -start==1)
            return ;
        int mid = start + (end -start)/2;
        mergeSortRecursionInPlace(arr,start,mid);
       mergeSortRecursionInPlace(arr,mid, end);

        merge(arr, start, mid,end);
    }

    // IMPORTANT - USE INDEXES TO DO IN-PLACE MERGING
    private static void merge(int[] arr, int s, int mid, int e) {
        int[] ans = new int[e-s];

        int i=s, j=mid, k=0;

        while (i<mid && j<e){

            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
            }
            else {
                ans[k]=arr[j];
                j++;
            }
            k++;

        }

        while (i<mid){
            ans[k]=arr[i];
            i++;k++;
        }

        while (j<e){
            ans[k]=arr[j];
            j++;k++;
        }

        // replace the ans again back to the arr - original array
        for(k=0;k<ans.length;k++)
            arr[s+k] = ans[k];
    }
}
