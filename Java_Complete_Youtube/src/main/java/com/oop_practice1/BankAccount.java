package com.oop_practice1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public double withdraw(double amount){
        if(amount<=0){
            throw new RuntimeException("illigal Request exception");
        }
        if(this.balance>=amount) {
            System.out.println("Thank you for banking with us");
            return this.balance -= amount;
        }
        System.out.println("You do not have enough balance!");
        throw new RuntimeException("illigal Request exception");
    }
    public void deposite(double amount){
        if(amount<=0){
            System.out.println("Invalid Amount!");
        }else {
            this.balance += amount;
        }
    }
}
