package Array.LeetCodeQuestions.Array2D;

import java.util.*;

public class MaxUnitsTrucks {

    public static void main(String[] args) {

        int[][] arr = {{1,3},{2,2},{3,1}};
        System.out.println(maximumUnits(arr, 4));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        TreeMap<Integer, Integer> tm = new TreeMap<>(Collections.reverseOrder());

        for(int[] i : boxTypes){

            tm.put(i[1], i[0]);
        }


        int units =0;

        for(Map.Entry<Integer, Integer> map : tm.entrySet()){
            System.out.println(map);
            truckSize -=map.getValue();
            if(truckSize<0){
                units +=map.getKey() * (truckSize+map.getValue());
                System.out.println(units);
                return units;
            }
            else {
                units += map.getKey() * map.getValue();
                System.out.println(units);
            }

        }

        return units;
    }
}
