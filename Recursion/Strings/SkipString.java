package Recursion.Strings;

public class SkipString {

    public static void main(String[] args) {
        System.out.println(skipApple("adskmcskdncjsdncjsApplesdjcnsdjkncsjdcns"));
    }
    static String skipApple(String str){
        if(str.isEmpty())
            return "";

        if(str.startsWith("Apple"))
            return skipApple(str.substring(str.indexOf("e")+1)); // str.substring(5)
        else
            return str.charAt(0) +skipApple(str.substring(1));
    }
}
