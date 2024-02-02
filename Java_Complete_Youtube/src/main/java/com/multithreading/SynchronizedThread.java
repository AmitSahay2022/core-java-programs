package com.multithreading;

public class SynchronizedThread extends Thread{
    private Counter counter;
    public SynchronizedThread(Counter counter){
        this.counter=counter;
    }
    public void run(){
        for(int i=0;i<100;i++){
            counter.increment();
        }
    }
}
