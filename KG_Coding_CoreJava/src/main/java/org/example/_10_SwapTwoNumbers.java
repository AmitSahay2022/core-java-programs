package org.example;

public class _10_SwapTwoNumbers {
    public static void main(String[] args) {
        int num1=10;
        int num2=15;
        System.out.println("Before swapping: "+num1+" "+num2);
        int temp=num1; //now num1 is safe
        num1=num2; //now num2 is saved inside num1;
        num2=temp; //store temp into num2
        System.out.println("After Swapping: "+num1+" "+num2);

    }
}
