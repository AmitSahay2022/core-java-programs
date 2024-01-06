package com.sahay;

import java.util.Scanner;

//Enter 8 or more character password
class PasswordChecker {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String password="";
        do{
            System.out.println("Enter password");
            password=sc.next();
        }while (password.length()<8);
    }
}
