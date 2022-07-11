package SlidingWindow.GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstNegativeIntegerWindowK {

    public static void main(String[] args) {
        long[] A = {-8,2,3,-6,10};

        System.out.println(Arrays.toString(printFirstNegativeInteger(A, 5,2)));
    }

//    https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
    public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int i =0;
        int j =0;
        int k =0;
        int size = A.length;
        long[] ans = new long[size -K +1 ]; // IMPORTANT

        List<Long> temp = new ArrayList<>();

        while(j<size){

            if(A[j]<0) //ADDING EVERY Jth NEGATIVE NUMBER
                temp.add(A[j]);

            if((j-i+1)<K)
                j++;

            else if((j-i+1) ==K )
            {
                if(temp.isEmpty()) //EDGE CASE WHEN NO ELEMENT IS NEGATIVE IN TEMP
                    ans[i]=0;
                else {
                    ans[i] = temp.get(0);
                    if (A[i] == temp.get(0)) //CHECK IF ALREADY PRESENT IN TEMP REMOVE Ith ELEMENT
                        temp.remove(0);
                }
                j++;
                i++;
            }
        }

        return ans;
    }
}
