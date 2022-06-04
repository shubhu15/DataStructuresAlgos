package Maths.BitWiseOp;

public class FlippingImage {
// 1. flip each row 2. invert the image
    public static void main(String[] args) {

    }
    int[][] flipInvert(int[][] a){

        for(int[] r:a){
            int i =0;
            int j =a.length-1;
            while (i<=j){
                int temp =r[i] ^ 1;
                r[i] =r[j] ^1;
                r[j]=temp;
                i++;
                j--;
            }

        }
        return a;
    }

    private void reverse(int[] a) {

//        return a;
    }
}
