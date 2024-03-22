package org.example;

public class _8_Sum_Of_Digits_In_a_Number {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(7643));
    }
    public static int sumOfDigits(int number){
        int sum=0;
        while (number!=0){
            sum=sum+number%10;
            number=number/10;
        }
        return sum;
    }
}
