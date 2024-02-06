package com.multithreading;

public class _100_ThreadJoin extends Thread{
    private String name;
    public _100_ThreadJoin(String name){
        this.name=name;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i+"Hello From Thread "+name);
        }
        System.out.println(name+" Thread Ends");
    }

    public static void main(String[] args) throws InterruptedException {
        _100_ThreadJoin threadJoin1=new _100_ThreadJoin("Sachin");
        _100_ThreadJoin threadJoin2=new _100_ThreadJoin("Ganguly");
        _100_ThreadJoin threadJoin3=new _100_ThreadJoin("Rahul");
        threadJoin1.start();
        threadJoin1.join();
        threadJoin2.start();
        threadJoin2.join();
        threadJoin3.start();
    }
}
