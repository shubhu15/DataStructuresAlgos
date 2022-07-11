package Recursion.LeetCodeQuestion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhone {

    public static void main(String[] args) {
//        padCombination("","12");
        System.out.println(letterCombinationsSol2("23"));
    }

    //not exact a leetcode question first to know the approach
    public static void padCombination(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0)-'0'; // convert '1' to 1
        for(int i =(digit-1)*3 ; i< digit*3 ; i++){

            char ch = (char)('a'+i); // convert to char from ascii value
            padCombination(p+ch, up.substring(1));
        }
    }

//    https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    public List<String> letterCombinationsSol1(String digits) {
        if(digits.isEmpty())
            return new ArrayList<String>();
        return helperLetter("",digits);

    }
    List<String> helperLetter(String  p, String up){
        if(up.isEmpty()){
            List<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;

        }
        List<String> ans = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        if(digit==7)
            for(int i = (digit-2)*3 ; i<=((digit-1)*3) ;i++){

                char ch =(char) ('a'+i);
                ans.addAll(helperLetter(p+ch, up.substring(1)));

            }
        else if(digit==8)
            for(int i =19 ; i<22 ;i++){

                char ch =(char) ('a'+i);
                ans.addAll(helperLetter(p+ch, up.substring(1)));

            }
        else if(digit==9)
            for(int i =22 ; i<26 ;i++){

                char ch =(char) ('a'+i);
                ans.addAll(helperLetter(p+ch, up.substring(1)));

            }
        else if(digit!=1)
            for(int i = (digit-2)*3 ; i<(digit-1)*3 ;i++){

                char ch =(char) ('a'+i);
                ans.addAll(helperLetter(p+ch, up.substring(1)));

            }
       return ans;
    }

    // solution using string array as map rather than range of numbers
    public static List<String> letterCombinationsSol2(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return helperLetter2("",digits, map);

    }

    private static List<String> helperLetter2(String p, String up, String[] map) {

        if(up.isEmpty()){
            List<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;

        }
        List<String> ans = new ArrayList<>();
        int digit = up.charAt(0)-'0';


        String mapWith = map[digit];
            for(int i = 0 ; i<mapWith.length() ;i++){

                char ch =mapWith.charAt(i);
                ans.addAll(helperLetter2(p+ch, up.substring(1), map));

            }
        return ans;
    }
}
