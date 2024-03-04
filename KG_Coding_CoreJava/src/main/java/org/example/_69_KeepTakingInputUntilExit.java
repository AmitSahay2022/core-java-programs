package org.example;

import java.util.Scanner;

public class _69_KeepTakingInputUntilExit {
    public static void main(String[] args) {
        takeInput();
    }
    public static void takeInput(){
        Scanner input=new Scanner(System.in);
        String value="";
        do{
            System.out.println("Enter some name or enter exit");
            value=input.next();
        }while (!value.equals("exit"));
    }
}
