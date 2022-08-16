package String.Basic;

public class FirstUniqueCharacter {

//    https://leetcode.com/problems/first-unique-character-in-a-string/
    public int firstUniqChar(String s) {

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c))
                return i;
        }

        return -1;
    }

    public int firstUniqChar2(String s) {

        char[] arr = s.toCharArray();
        int len = arr.length;


        int[] fre = new int[26];
        for(char c : arr) fre[c-'a']++;


        for(int i=0; i<len; i++) if(fre[arr[i]-'a'] == 1) return i;
        return -1;
    }
}
