package Recursion.Strings;

import java.util.ArrayList;

public class PermutationsCount {

    public static void main(String[] args) {
        System.out.println(permutationCount("","abc"));
    }

    static int permutationCount(String p, String up){
        if(up.isEmpty())
        {   return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for(int i =0; i<=p.length();i++){
            String firstStr = p.substring(0,i);
            String secondStr = p.substring(i);
            count += permutationCount(firstStr.concat(ch+"").concat(secondStr), up.substring(1));
        }

        return count;


    }
}


