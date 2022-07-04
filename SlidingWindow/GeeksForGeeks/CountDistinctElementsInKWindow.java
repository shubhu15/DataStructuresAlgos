package SlidingWindow.GeeksForGeeks;

import java.util.*;

public class CountDistinctElementsInKWindow {


//    https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here X1
        int i=0;
        int j =0;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> temp = new HashMap();


        while(j<n){
            if(temp.containsKey(A[j]))
                temp.put(A[j], temp.get(A[j])+1);
            else
                temp.put(A[j], 1);

            if((j-i+1)<k)
                j++;

            else if((j-i+1)==k){
                ans.add(temp.size());

                if(temp.containsKey(A[i])){
                    int c = temp.get(A[i])-1;
                    if(c==0)
                        temp.remove(A[i]);
                    else
                        temp.put(A[i], c);


                }

                i++;
                j++;


            }



        }

        return ans;

    }
}
