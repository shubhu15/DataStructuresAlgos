package Recursion.Array;

import java.util.ArrayList;

public class LinearSearchWithNewConcept {

    public static void main(String[] args) {
        System.out.println(checkElement(new int[]{2, 3,4,6 ,1}, 4));
    }

    private static ArrayList<Integer> checkElement(int[] ints, int target) {
        int start =0;
        return helperLinearSearch(ints,target,start);

    }

    // not optimised approach as new arrays are created everytime
    private static ArrayList<Integer> helperLinearSearch(int[] n, int target,
                                                         int index){

        ArrayList<Integer> arr = new ArrayList<>();
        if(index== n.length)
            return arr;
        if(target== n[index])
            arr.add(index);

        ArrayList<Integer> ansFromBelowCalls = helperLinearSearch(n,target,index+1);

        arr.addAll(ansFromBelowCalls);
        return arr;

    }
}
