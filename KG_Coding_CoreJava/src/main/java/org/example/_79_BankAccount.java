package org.example;

import java.util.Scanner;

public class _79_BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public _79_BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposite(double amount){
        if(amount>=100) {
            this.balance += amount;
        }
        else
            System.out.println("Oops Amount less than 100 can not be deposited!");
    }
    public double withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid Amount");
            return 0;
        }
        if(amount<=this.balance){
            System.out.println("Thankyou for banking with us");
            this.balance-=amount;
            return amount;
        }
        System.out.println("You do not have enough balance ");
        return 0;
    }
    public void balance(){
        System.out.println("Your current balance is: "+this.balance);
    }

    public static void main(String[] args) {
        _79_BankAccount bankAccount1=new _79_BankAccount("123","Vijay",654329);
        _79_BankAccount bankAccount2=new _79_BankAccount("85431","Amit",34000);
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("Enter D for deposite W for withdraw. C for check balance. E for exit");
            char res=input.next().charAt(0);
            if(res=='E' || res=='e'){
                return;
            }
            if(res=='D' || res=='d'){
                System.out.println("Enter amount to deposite");
                double amount=input.nextDouble();
                System.out.println("Enter account number");
                String accNum=input.next();
                if(bankAccount1.getAccountNumber().equals(accNum)){
                    bankAccount1.deposite(amount);
                }
                if(bankAccount2.getAccountNumber().equals(accNum)){
                    bankAccount2.deposite(amount);
                }
            }
            if(res=='W'||res=='w'){
                System.out.println("Enter amount to withdraw");
                double amount=input.nextDouble();
                System.out.println("Enter account number");
                String accNum=input.next();
                if(bankAccount1.getAccountNumber().equals(accNum)){
                    bankAccount1.withdraw(amount);
                }
                if(bankAccount2.getAccountNumber().equals(accNum)){
                    bankAccount2.withdraw(amount);
                }
            }
            if(res=='C' || res=='c'){
                System.out.println("Enter account number");
                String accNum=input.next();
                if(bankAccount1.getAccountNumber().equals(accNum)){
                    bankAccount1.balance();
                }
                if(bankAccount2.getAccountNumber().equals(accNum)){
                    bankAccount2.balance();
                }
            }
        }
    }

}
