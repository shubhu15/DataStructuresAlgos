package Recursion.Strings;

public class SkipAChar {

    public static void main(String[] args) {
        System.out.println(skipACharacter("bcbcbcbaababa",0,""));

        skipACharacter2("bbccjsmawaa","");
    }

    static String skipACharacter(String str, int i , String ans){

        if(i==str.length()-1)
            return ans;
        if(str.charAt(i)!='a'){
            ans +=str.charAt(i);
        }
        return skipACharacter(str,i+1,ans);
    }

    static void skipACharacter2(String str, String ans){

        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(0)=='a')
            skipACharacter2(str.substring(1),ans);
        else
            skipACharacter2(str.substring(1),ans+str.charAt(0));
    }

    //important
    static String skipACharacter3(String str){
        if(str.isEmpty())
            return "";

        char ch = str.charAt(0);
        if(ch=='a')
            return skipACharacter3(str.substring(1));
        else
            return ch +skipACharacter3(str.substring(1));
    }
}
