package Recursion.Strings;

import java.util.ArrayList;

public class StringSubsetAscii {

    public static void main(String[] args) {
        System.out.println(subsets3("","abc"));
    }


    private static ArrayList<String> subsets3(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        ArrayList left = subsets3(p+ch, up.substring(1));
        ArrayList ascii = subsets3(p+(ch+0),up.substring(1));
        ArrayList right =subsets3(p, up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
