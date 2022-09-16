package Array.Basic;

public class PlusOne {
//    https://leetcode.com/problems/plus-one/

    public int[] plusOne(int[] digits) {

        int carry =0;
        int[] ans = new int[digits.length+1];
        int sum =1;
        for(int i =digits.length-1; i>=0; i-- ){
            sum += digits[i]+carry;
            if(sum<10)
            {
                digits[i] = sum;
                return digits;
            }
            else{
                sum = sum%10;
                carry =1;
                if(i==0){
                    digits[i]= sum;
                    ans[0] = carry;
                    for(int j =0; j<digits.length;j++)
                        ans[j+1] = digits[j];
                    return ans;
                }
                else{
                    digits[i]= sum;
                }
            }
        }



        return null;
    }

    public int[] plusOne_other(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }
}
