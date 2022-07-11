package SlidingWindow.LeetCodeQuestions;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingChar {

//    https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstring(String s) {


        HashMap<Character, Integer> hm = new HashMap();

        int i=0, j=0, max=0;

        while(j<s.length()){
            Character c = s.charAt(j);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else
                hm.put(c, 1);

//             if(hm.size()<(j-i+1))
//                 j++;

            if(hm.size()==(j-i+1)){
                max = Math.max(max, j-i+1);
                j++;
            }
            else{
                while(hm.size()<(j-i+1)){
                    Character d = s.charAt(i);
                    if(hm.containsKey(d)){
                        int e = hm.get(d)-1;
                        if(e==0)
                            hm.remove(d);
                        else
                            hm.put(d,e);
                    }
                    i++;
                }
                j++;

            }

        }

        return max;
    }
}
