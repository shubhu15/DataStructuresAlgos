package Search.LeetCodeQuestions.Easy;

public class FirstBadVersion {

//    https://leetcode.com/problems/first-bad-version/
    public int firstBadVersion(int n) {
        int ans =-1;
        int start =0;
        int end = n-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(isBadVersion(mid+1))
            {
                ans = mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }

        return ans+1;
    }

    private boolean isBadVersion(int i) {

        return Math.random()== Math.random();
    }
}
