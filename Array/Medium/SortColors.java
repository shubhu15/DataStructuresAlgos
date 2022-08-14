package Array.Medium;

public class SortColors {
//    https://leetcode.com/problems/sort-colors/
//    1. COUNTING SORT APPROACH
    public void sortColors(int[] arr) {

        int[] s = new int[3];

        for(int i : arr){
            s[i]++;
        }
        int j =0;

        for(int i=0; i<3;i++){
            while(s[i]>0){
                arr[j]=i;
                j++;
                s[i]--;
            }
        }
    }

//    2. Dutch National Flag Algo
    public void sortColors2(int[] arr) {
        int low=0, high=arr.length-1, mid=0;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if(arr[mid]==1)
                mid++;
            else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    void swap(int[] arr, int mid, int l){
        int temp= arr[mid];
        arr[mid] = arr[l];
        arr[l] = temp;
    }
}
