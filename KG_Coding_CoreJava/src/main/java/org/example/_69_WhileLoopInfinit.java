package org.example;

import java.util.Scanner;

public class _69_WhileLoopInfinit {
    public static void main(String[] args) {
        takeInput();
    }
    public static void takeInput(){
        Scanner input=new Scanner(System.in);
        String command="";
        while (true){
            System.out.println("Enter exit to exit");
            command=input.next();
            if(command.equals("exit")){
                break;
            }
        }
        System.out.println("Successful Exit");
    }
}
