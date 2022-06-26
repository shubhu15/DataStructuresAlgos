package Recursion.Strings;

import java.util.ArrayList;

public class StringSubsets {

    public static void main(String[] args) {
        System.out.println(subsets2("", "abc"));
    }

    private static void subsets(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsets(p+ch, up.substring(1));
        subsets(p, up.substring(1));
    }

    private static ArrayList<String> subsets(String p, String up, ArrayList arr) {
        if(up.isEmpty()){
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        subsets(p+ch, up.substring(1), arr);
        subsets(p, up.substring(1), arr);
        return arr;
    }

    private static ArrayList<String> subsets2(String p, String up) {
        ArrayList<String> arr = new ArrayList<>();
        if(up.isEmpty()){
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        ArrayList left = subsets2(p+ch, up.substring(1));
        ArrayList right =subsets2(p, up.substring(1));
        arr.addAll(left);
        arr.addAll(right);
        return arr;
    }

    private static ArrayList<String> subsets3(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        ArrayList left = subsets3(p+ch, up.substring(1));
        ArrayList right =subsets3(p, up.substring(1));
        left.addAll(right);
        return left;
    }

}
