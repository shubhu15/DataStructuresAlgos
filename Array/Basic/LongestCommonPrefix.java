package Array.Basic;

public class LongestCommonPrefix {


//    https://leetcode.com/problems/longest-common-prefix/submissions/

    // not optimum - Brute force
    public String longestCommonPrefix(String[] strs) {

        String minStr=""; int minLen =Integer.MAX_VALUE;

        for(String i : strs){
            if(minLen>i.length()){
                minLen = i.length();
                minStr = i;
            }
        }
        String s="";
        for(int i =minStr.length(); i>0;i--){
            s = minStr.substring(0,i);
            int flag =0;
            for(String str: strs){
                if(!str.startsWith(s))
                    flag =1;
            }
            if(flag!=1)
                return s;


        }

        return "";
    }

//    sorting / getting the smallest and largest string and only comparing them -- O(n)
    public String longestCommonPrefix2(String[] strs) {

        String smallestString = strs[0], largestString = strs[0];
        for(int i=0; i<strs.length; ++i){
            if(smallestString.compareTo(strs[i]) >0){
                smallestString = strs[i];
            }
            if(largestString.compareTo(strs[i]) <0){
                largestString = strs[i];
            }
        }

        int c =0;

        while(c<smallestString.length()){

            if(smallestString.charAt(c)== largestString.charAt(c))
                c++;
            else
                break;
        }

        return c==0? "": smallestString.substring(0,c);
    }
}
