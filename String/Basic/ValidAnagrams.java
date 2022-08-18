package String.Basic;

public class ValidAnagrams {

//    https://leetcode.com/problems/valid-anagram/
    public boolean isAnagram_MY(String s, String t) {
        int[] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        for(char c : t.toCharArray()){
            freq[c-'a']--;
            if(freq[c-'a']<0)
                return false;
        }
        for(int i : freq){
            if(i!=0)
                return false;
        }

        return true;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] freqs=new int[26];
        for (char c: s.toCharArray()) freqs[c-'a']++;
        for (char c: t.toCharArray()) if (--freqs[c-'a']<0) return false;
        return true;
    }
}
