package String.Medium;

import java.util.*;
import java.util.stream.IntStream;

public class SortByFrequency {

    public static void main(String[] args) {
        System.out.println(frequencySort("treeeesjnckendkencrf"));
    }

//    https://leetcode.com/problems/sort-characters-by-frequency/
    public static String frequencySort(String s) {

        HashMap<Character, Integer> pairHashMap = new HashMap<>();

        for(int i =0; i<s.length(); i++){
          if(pairHashMap.containsKey(s.charAt(i))){
              pairHashMap.put(s.charAt(i), pairHashMap.get(s.charAt(i))+1);
          }
          else
              pairHashMap.put(s.charAt(i), 1);
        }

        List list = new ArrayList(pairHashMap.entrySet()); //IMPORTANT SYNTAX TO SORT HASHMAPS !!!!

        Collections.sort(list, (Comparator) (o1, o2) -> {
            int m1 = ((Map.Entry<Character,Integer>)(o1)).getValue();
            int m2 = ((Map.Entry<Character,Integer>)(o2)).getValue();
            return m2-m1;
        });
        StringBuilder str = new StringBuilder();
        for(Object i : list){
            char ch = ((Map.Entry<Character,Integer>)(i)).getKey();
            int count = ((Map.Entry<Character,Integer>)(i)).getValue();
            while(count>0){
                str.append(ch);
                count--;
            }
        }

        return str.toString();
    }

    //using priority queue
    public String frequencySort_PRIORITY_QUEUE(String s) {
        Map<Character, Integer> map = new HashMap<>();

//          JAVA - 8 WAY FOR ITERATING
//        IntStream.range(0, s.length()).forEach(i -> map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1));

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry e = pq.poll();
            for (int i = 0; i < (int)e.getValue(); i++)
                sb.append(e.getKey());
        }
        return sb.toString();
    }

//    There is a follow-up if you are interested, when same frequency we need to maintain the same
//    sequence as the character show in the original string, the solution is add a index as a
//    secondary sort if the frequency is same, code as below:

    public static String frequencySort_FOLLOW_UP(String s) {
        Map<Character, int[]> map = new HashMap<>();
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) map.put(c, new int[]{1, i});
            else {
                int[] freqAndSeq = map.get(c);
                freqAndSeq[0]++;
                map.put(c, freqAndSeq);
            }
        }

        PriorityQueue<Map.Entry<Character, int[]>> pq = new PriorityQueue<>((a, b) ->
                a.getValue()[0] == b.getValue()[0] ? a.getValue()[1] - b.getValue()[1] : b.getValue()[0] - a.getValue()[0]);

        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, int[]> e = pq.poll();
            for (int i = 0; i < e.getValue()[0]; i++)
                sb.append(e.getKey());
        }
        return sb.toString();
    }

//    ANOTHER follow-up question: what if i want the characters are sorted alphabetically
//    if the characters have the same frequency ?
//PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
// (a, b) -> a.getValue() != b.getValue() ? b.getValue() - a.getValue() : a.getKey().compareTo(b.getKey()));

//    https://leetcode.com/problems/sort-characters-by-frequency/discuss/365179/Blueprint-to-100-or-Optimisation-or-38-ms-to-2ms-or-5-Solution-or-optimisation-step-by-step

}

