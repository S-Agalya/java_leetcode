package myapp;

public class Plusone {
    

    public int[] plusOne(int[] digits) {
        int lastelement=digits[digits.length-1];
        digits[digits.length-1]=lastelement+1;
        int[] result=new int[digits.length];
        for(int i=0;i<=digits.length-1;i++){
            result[i]=digits[i];
        }
        return result;
    }
}
