package org.example;

import java.util.Scanner;

public class _63_Do_While_CheckPassword_Length8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String password;
        do{
            System.out.println("Enter password");
            password=input.next();
            if(password.length()<8)
                System.out.println("Length should be 8 or greater");
        }while (password.length()<8);
        System.out.println("Now you entered Valid one");
    }
}
