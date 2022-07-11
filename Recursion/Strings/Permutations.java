package Recursion.Strings;

import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args) {
        permutationString("","abc");
//        System.out.println(permutationString2("","abc"));
    }

    static void permutationString(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String firstStr = p.substring(0, i);
            String secondStr = p.substring(i);
            permutationString(firstStr.concat(ch + "").concat(secondStr), up.substring(1));
        }
    }

        static ArrayList<String> permutationString2(String p, String up){
            if(up.isEmpty())
            {   ArrayList<String> ans = new ArrayList<>();
                ans.add(p);
                return ans;
            }

            ArrayList<String> a = new ArrayList<>();
            char ch = up.charAt(0);
            for(int i =0; i<=p.length();i++){
                String firstStr = p.substring(0,i);
                String secondStr = p.substring(i);
                a.addAll(permutationString2(firstStr.concat(ch+"").concat(secondStr), up.substring(1)));
            }

            return a;


    }
}
