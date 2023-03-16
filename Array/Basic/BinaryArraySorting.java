package Array.Basic;

public class BinaryArraySorting {
//    https://practice.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1

    static void binSort(int A[], int N)
    {
        // add your code here

        int i =0;
        int j = N-1;

        while(i<=j){

            if(A[i]==1 && A[j]==0){
                swap(A, i, j);
                i++;
                j--;
            }
            else if(A[j]==1)
                j--;
            else
                i++;


        }

    }

    static void swap(int[] a, int i ,int j ){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
