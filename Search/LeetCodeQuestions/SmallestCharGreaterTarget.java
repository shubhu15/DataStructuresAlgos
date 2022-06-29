package Search.LeetCodeQuestions;

public class SmallestCharGreaterTarget {

//    https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public char nextGreatestLetter(char[] letters, char target) {


        int start =0;
        int end = letters.length-1;

        while(start<=end){
            if(target>= letters[letters.length-1]) // wrap around to the first element
                return letters[0];

            int mid = start + (end-start)/2;

            if(target<letters[mid])
                end = mid-1;
            else
                start = mid+1;
        }

        return letters[start]; // line14 or letters[start%letter.length] --> for wrapping around
    }
}
