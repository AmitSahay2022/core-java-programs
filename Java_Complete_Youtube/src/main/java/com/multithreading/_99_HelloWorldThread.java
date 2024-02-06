package com.multithreading;

public class _99_HelloWorldThread implements Runnable{
    public static void main(String[] args) {
         _99_HelloWorldThread thread1=new _99_HelloWorldThread();
         _99_HelloWorldThread thread2=new _99_HelloWorldThread();
         new Thread(thread1).start();
         new Thread(thread2).start();
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello World from Thread "+Thread.currentThread());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
