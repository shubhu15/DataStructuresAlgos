package String;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class IsIsomorphic {

//    https://leetcode.com/problems/isomorphic-strings/
    public boolean isIsomorphic(String s, String t) {
        int n = s.length(); int m = t.length();

        if(n!=m)
            return false;

        LinkedHashMap<Character,Character> hs = new LinkedHashMap<>();
        LinkedHashMap<Character,Character> ht = new LinkedHashMap<>();


        for(int i=0;i<n;i++){
            hs.put( s.charAt(i),  t.charAt(i));
        }

        for(int i=0;i<n;i++){
            ht.put( t.charAt(i),  s.charAt(i));
        }

        if(hs.size()!=ht.size())
            return false;

        Iterator<Map.Entry<Character, Character>> it = hs.entrySet().iterator(); //IMPORTANT!!
        for(Map.Entry<Character, Character> mp : ht.entrySet()){
            Map.Entry<Character, Character> new_Map
                    = it.next();
            // System.out.print(mp.getValue() +" " +new_Map.getKey());
            if(!mp.getValue().equals(new_Map.getKey()))
                return false;

        }

        return true;
    }
}
