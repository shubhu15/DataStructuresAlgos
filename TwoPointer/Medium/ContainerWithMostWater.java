package TwoPointer.Medium;

public class ContainerWithMostWater {

//    https://leetcode.com/problems/container-with-most-water/
    public int maxArea(int[] height) {

        int n = height.length;

        int maxArea =0;

        int i =0;
        int j =n-1;

        while(i<=j){

            maxArea = Math.max(maxArea, Math.min(height[i], height[j])* (j-i));
            if(height[j]>height[i])
                i++;
            else
                j--;
        }

        return maxArea;
    }
}
