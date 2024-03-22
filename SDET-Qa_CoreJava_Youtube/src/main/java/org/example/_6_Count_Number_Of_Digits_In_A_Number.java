package org.example;

public class _6_Count_Number_Of_Digits_In_A_Number {
    public static void main(String[] args) {
        System.out.println(numberOfDigits(678589));
    }
    public static int numberOfDigits(int number){
        int digits=0;
        while (number!=0){
            digits++;
            number=number/10;
        }
        return digits;
    }
}
