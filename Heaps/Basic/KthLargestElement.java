package Heaps.Basic;

import java.util.PriorityQueue;

public class KthLargestElement {

    //  NOT OPTIMUM - CAN BE SOLVED USING QUICK SORT-
    //  https://leetcode.com/problems/kth-largest-element-in-an-array/discuss/2180600/A-Guide-to-Quick-Select-or-JAVA
//    https://leetcode.com/problems/kth-largest-element-in-an-array/
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int i =0;i<k;i++)
            minheap.add(nums[i]);

        for(int i =k;i<nums.length;i++){
            if(minheap.peek()<nums[i]) {
                minheap.poll();
                minheap.add(nums[i]);
            }

        }

        return minheap.peek();

    }
}
