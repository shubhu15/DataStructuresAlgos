package Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubsets {

    public static void main(String[] args) {
//        System.out.println(subsetArray(new int[]{1,2,3}));

        System.out.println(subsetArrayWithDup(new int[]{1,2,2}));
    }

    static List<List<Integer>> subsetArray(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for( int n:arr){
            int size = outer.size();
            for(int i =0; i<size;i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(n);
                outer.add(inner);
            }
        }

        return outer;
    }

    static List<List<Integer>> subsetArrayWithDup(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        Arrays.sort(arr);
        outer.add(new ArrayList<>());

        int start =0,end=0;
        for( int j =0; j<arr.length;j++){
            start=0;

            if(j>0 && arr[j]==arr[j-1])
                start= end+1;

            end= outer.size()-1;
            int size = outer.size();

            for(int i =start; i<size;i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }
        }

        return outer;
    }
}
