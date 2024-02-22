package org.example;

public class _37_ReverseDigit {
    public static void main(String[] args) {
        System.out.println(reverse(67));
    }
    public static int reverse(int number){
        int rev=0;
        while (number>0){
            rev=rev*10+number%10;
            number/=10;
        }
        return rev;
    }
}
