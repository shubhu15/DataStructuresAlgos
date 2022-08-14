package Maths.BitWiseOp;

public class FlippingImage {

//    https://leetcode.com/problems/flipping-an-image/
// 1. flip each row 2. invert the image
    public static void main(String[] args) {

    }
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;


        for(int i =0; i<n;i++){

            int j=0,k=image[i].length-1;
            while(j<=k){

                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][k] ^ 1;
                image[i][k] = temp;
                j++;k--;
            }

        }

        return image;
    }

    private void reverse(int[] a) {

//        return a;
    }
}
