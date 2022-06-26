package Recursion.Array;

import java.util.ArrayList;

public class LinearSearchWithRecursion {

    public static void main(String[] args) {
        System.out.println(checkElement(new int[]{2, 3,4,6 ,1}, 4));
    }

    private static boolean checkElement(int[] ints, int target) {
        int start =0;
        return helperCheck(ints,target,start);

    }

    private static boolean helperCheck(int[] n, int target, int start) {
        if(start== n.length)
            return false;
        return n[start]==target || helperCheck(n, target, start+1);
    }

    private static int helperCheck2(int[] n, int target, int start) {
        if(start== n.length)
            return -1;
        if(n[start]==target)
            return start;
        return helperCheck2(n, target, start+1);
    }

    static ArrayList<Integer> arr = new ArrayList<>();
    private static void helperCheckAll(int[] n, int target, int start) {
        if(start== n.length)
            return ;
        if(n[start]==target)
            arr.add(start);
        helperCheckAll(n, target, start+1);
    }

    //return the arraylist --> pass it in the parameter of function call
    private static ArrayList<Integer> helperLinearSearch(int[] n, int target,
                                                         int index, ArrayList<Integer> ls){
        if(index== n.length)
            return ls;
        if(target== n[index])
            ls.add(index);
        return helperLinearSearch(n,target,index+1,ls);

    }
}
