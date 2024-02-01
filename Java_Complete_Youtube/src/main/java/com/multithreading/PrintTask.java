package com.multithreading;

public class PrintTask extends Thread {
    private char targetChar;
    public PrintTask(char targetChar){
        this.targetChar=targetChar;
    }
    public void run(){
        for (int i=1;i<=1000;i++){
            System.out.print(targetChar+" "+i);
        }
        System.out.println("\nTask "+targetChar+" completed");
    }
}
