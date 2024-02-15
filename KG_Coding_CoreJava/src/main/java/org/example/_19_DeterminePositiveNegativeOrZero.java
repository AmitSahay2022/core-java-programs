package org.example;

public class _19_DeterminePositiveNegativeOrZero {
    public static void main(String[] args) {
        System.out.println(determine(9));
        System.out.println(determine(-7));
        System.out.println(determine(0));
    }
    public static String determine(int number){
        return number>0 ? "Positive" : number<0 ? "Negative":"Zero";
    }
}
