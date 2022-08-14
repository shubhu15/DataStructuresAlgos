package Array.Basic;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {


//    https://leetcode.com/problems/pascals-triangle/

    // MY SOLUTION -
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> an = new ArrayList<>();

        an.add(1);
        ans.add(an);
        if(numRows ==1)
        {
            return ans;
        }
        List<Integer> an2 = new ArrayList<>();
        an2.add(1);
        an2.add(1);
        ans.add(an2);

        if(numRows ==2)
        {
            return ans;
        }
        else {

            for(int i =2;i<numRows; i++){
                int size = ans.get(i-1).size();
                List<Integer> an3 = new ArrayList<>();
                an3.add(1);
                for(int j=0;j <size-1;j++){
                    List<Integer> an4 = ans.get(i-1);
                    int f = an4.get(j) +an4.get(j+1);
                    an3.add(f);
                }
                an3.add(1);

                ans.add(an3);
            }

            return ans;
        }
    }

//  BETTER SOLUTION---- >
    public List<List<Integer>> generate2(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row, prev =null;

        for(int i =0; i<numRows;i++){

            row = new ArrayList<>();

            for(int j =0; j<=i; j++){  // as each column have elements = row number

                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(prev.get(j-1) + prev.get(j));

            }
            prev = row;
            ans.add(row);
        }

        return ans;


    }
}
