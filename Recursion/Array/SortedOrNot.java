package Recursion.Array;

public class SortedOrNot {

    public static void main(String[] args) {
        System.out.println(sorted(new int[]{1,6,4,5}));
    }

    private static boolean sorted(int[] ints) {
        int len = ints.length;
        return helperSort(ints,0,len);
    }

    private static boolean helperSort(int[] ints, int i, int len) {
        if(i==len-1)
            return true;
        if(ints[i]>ints[i+1])
            return false;
        return helperSort(ints,i+1,len);


//        return ints[i]<ints[i+1] && helperSort(ints,i+1,len);  also works same

    }
}
