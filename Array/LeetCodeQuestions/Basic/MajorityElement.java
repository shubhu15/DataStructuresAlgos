package Array.LeetCodeQuestions.Basic;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {

//    https://leetcode.com/problems/majority-element/
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = nums.length/2 + 1;

        for(int i : nums){

            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }

            else
                hm.put(i, 1);

            if(hm.get(i)==count)
                return i;

        }

        return 0;

    }

    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

//    https://www.cs.utexas.edu/~moore/best-ideas/mjrty/example.html
    // Moore voting algorithm
    public int majorityElement3(int[] nums) {
        int count=0, ret = 0;
        for (int num: nums) {
            if (count==0)
                ret = num;
            if (num!=ret)
                count--;
            else
                count++;
        }
        return ret;
    }

}
