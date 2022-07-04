package SlidingWindow.LeetCodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllAnagramsInString {

//    https://leetcode.com/problems/find-all-anagrams-in-a-string/
    public List<Integer> findAnagrams(String s, String p) {


        List<Integer> ans = new ArrayList<>();

        HashMap<Character, Integer> hm = new HashMap();

        for(Character c : p.toCharArray()){
            if(hm.containsKey(c))
                hm.put(c, hm.get(c)+1);
            else
                hm.put(c,1);
        }

        int i=0, j =0, count = hm.size();

        while(j<s.length()){

            if(hm.containsKey(s.charAt(j))){
                int c = (int)hm.get(s.charAt(j));
                c -=1;
                hm.put(s.charAt(j), c);
                if(c==0)
                    count--;
            }


            if(j-i+1 < p.length())
                j++;

            else if(j-i+1 == p.length()){
                if(count ==0)
                    ans.add(i);
                if(hm.containsKey(s.charAt(i))){
                    int c = (int)hm.get(s.charAt(i));
                    c +=1;
                    hm.put(s.charAt(i), c);
                    if(c==1)
                        count++;
                }
                i++;
                j++;

            }

        }

        return ans;



    }
}
