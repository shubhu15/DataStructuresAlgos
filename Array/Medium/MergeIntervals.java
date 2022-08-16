package Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{8,9},{9,11},{2,4},{16,17},{15,18}};
        merge(intervals);
    }

//    https://leetcode.com/problems/merge-intervals/
    public static int[][] merge(int[][] intervals) {

        List<int[]> ans = new ArrayList<>();

        if(intervals.length==0)
            return ans.toArray(new int[0][]);

        Arrays.sort(intervals,(o1, o2) -> o1[0]-o2[0]);
//        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals){

            if(i[0]<=end)
                end = Math.max(end,i[1]);
            else{
                ans.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }

        ans.add(new int[]{start,end});
        return ans.toArray(new int[0][]);
//      Params  a – the array into which the elements of this list are to be stored,
//      if it is big enough; otherwise, a new array of the same runtime type is allocated for this purpose.
    }
}
