package Array.Hard;

public class MedainSortedArrays {

//    https://leetcode.com/problems/median-of-two-sorted-arrays/
    //BRUTE FORCE
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] res = new int[n+m];

        int i=0, j=0, k=0;

        while(i<n && j<m){

            if(nums1[i]<nums2[j])
            {
                res[k]=nums1[i];
                i++;
            }
            else{   res[k]=nums2[j];
                j++;
            }
            k++;
        }

        while(i<n){
            res[k]=nums1[i];
            i++;
            k++;
        }


        while(j<m){
            res[k++]= nums2[j++];
        }
        double med=0.0;
        // System.out.println(res.length);
        if(res.length%2 ==0){

            int s = res.length/2;
            med = (res[s-1] +res[s])/2.0;
        }
        else
            med = res[res.length/2];

        return med;
    }
}
class Solution_EFFICENT {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        if(m<n)
            return findMedianSortedArrays(nums2, nums1);

        int low =0;
        int high = n;

        while(low<=high){

            int cut1= (low+high)/2;
            int cut2 = (n+m+1)/2 - cut1;

            int left1 = cut1==0? Integer.MIN_VALUE: nums1[cut1-1];
            int left2 = cut2==0? Integer.MIN_VALUE: nums2[cut2-1];

            int right1 = cut1==n? Integer.MAX_VALUE: nums1[cut1];
            int right2 = cut2==m? Integer.MAX_VALUE: nums2[cut2];

            if(left1<= right2 && left2<= right1){
                if((n+m)%2 == 0)
                    return (Math.max(left1, left2)+Math.min(right1, right2))/2.0;
                else
                    return (Math.max(left1, left2));
            }
            else if(left1>right2)
                high= cut1-1;
            else
                low = cut1+1;


        }

        return 0.0;
    }
}