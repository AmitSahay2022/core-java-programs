package org.example;
// only one condition will execute in the if-else ladder
import java.util.Scanner;

public class _26_If_Else_If_Ladders {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks=input.nextInt();
        if(marks>100){
            System.out.println("Invalid marks");
        }else if(marks>90){
            System.out.println("Great, You Got A");
        }else if(marks>75){
            System.out.println("Good, You Got B");
        } else if (marks>=60) {
            System.out.println("OK, C");
        } else if (marks>45) {
            System.out.println("Just Passed");
        }else {
            System.out.println("Fail");
        }
    }
}
