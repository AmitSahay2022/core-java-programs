package com.multithreading;

public class TestingSynchronized {
    public static void main(String[] args) throws InterruptedException{
        Counter counter=new Counter();
        SynchronizedThread thread1=new SynchronizedThread(counter);
        SynchronizedThread thread2=new SynchronizedThread(counter);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.getCount());
    }
}
