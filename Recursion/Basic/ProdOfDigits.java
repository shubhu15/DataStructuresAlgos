package Recursion.Basic;

public class ProdOfDigits {
    public static void main(String[] args) {
        System.out.println(getProduct(1001));
    }

    private static int getProduct(int i) {
        if(i%10 ==i)
            return i;
        return i%10 *getProduct(i/10);

    }
}
