package SlidingWindow.GeeksForGeeks;

import java.util.HashMap;

public class LongestSubsstringKUniqueChar {

//    https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
    public int longestkSubstr(String s, int k) {
        // code here

        HashMap<Character, Integer> hm = new HashMap();

        int i=0, j=0, max = -1;

        while(j< s.length()){
            Character c = s.charAt(j);
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }


            if(hm.size()<k)
                j++;

            else if(hm.size()==k){
                max = Math.max(max, j-i+1);
                j++;
                // System.out.println(max+" "+j+" "+i);
            }
            else if(hm.size()>k){

                while(hm.size()>k){
                    Character e = s.charAt(i);
                    if(hm.containsKey(e)){
                        int d = hm.get(e)-1;
                        if(d==0)
                            hm.remove(e);
                        else
                            hm.put(e, d);
                    }
                    i++;

                }
                j++;

            }

        }

        return max;
    }
}
