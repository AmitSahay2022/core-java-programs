package com.oop_practice1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        BankAccount account=new BankAccount("12345",568,"Kane");
        System.out.println("Press any key if You Want to Banking with us. press no to cancel");
        String c=sc.next();
        if(c.equals("no")){
            return;
        }
        while (true){
            System.out.println("press d for deposite, press w for withdraw, press b for check balance");
            char req=sc.next().charAt(0);
            if(req=='d'){
                System.out.println("Enter amount to deposite");
                double amt=sc.nextDouble();
                account.deposite(amt);
            } else if (req=='w') {
                System.out.println("Enter amount to withdraw");
                double amt=sc.nextDouble();
                account.withdraw(amt);
            } else if(req=='b'){
                System.out.println("Your Balance is: "+account.getBalance());
            }
            else{
                return;
            }

        }
    }
}
