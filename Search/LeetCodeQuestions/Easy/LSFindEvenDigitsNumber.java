package Search.LeetCodeQuestions.Easy;

public class LSFindEvenDigitsNumber {

//    https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public int findNumbers(int[] nums) {

        int ans =0;

        for(int i : nums){
            int dig = (int)(Math.log10(i))+1;
            if(dig%2==0)
                ans++;
        }

        return ans;
    }
}
