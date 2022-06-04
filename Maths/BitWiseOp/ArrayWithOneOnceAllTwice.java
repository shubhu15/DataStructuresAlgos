package Maths.BitWiseOp;

public class ArrayWithOneOnceAllTwice {


    public static void main(String[] args) {
        int[]  arr ={2,3,4,1,1,6,4,2,3};

        System.out.println (findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int res =0;
         for(int i:arr)
             res ^=i;

         return res;
    }
}
