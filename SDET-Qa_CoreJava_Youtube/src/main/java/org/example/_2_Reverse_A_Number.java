package org.example;

public class _2_Reverse_A_Number {
    public static void main(String[] args) {
        reverseNumber(-653);
        reverseUsingStringBuilder(89);
    }
    public static void reverseNumber(int num){
        System.out.println("Input= "+num);
        int rev=0;
        while (num!=0){   //!=0 it works for both negative and positive number, >0 works only for positive
            rev=(rev*10)+num%10;
            num/=10;
        }
        System.out.println("Output= "+rev);
    }
    public static void reverseUsingStringBuilder(int num){
        System.out.println("Original= "+num);
        StringBuilder sb=new StringBuilder(String.valueOf(num));
        sb.reverse();
        System.out.println("Reverse= "+sb);
    }
}
