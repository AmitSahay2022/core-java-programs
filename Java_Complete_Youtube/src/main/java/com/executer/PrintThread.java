package com.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PrintThread implements Runnable{
    private char task;
    public PrintThread(char task){
        this.task=task;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i+" "+task+" by "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException{
//        ExecutorService service = Executors.newSingleThreadExecutor();
        long startTime = System.currentTimeMillis();
        ExecutorService service = Executors.newFixedThreadPool(3);

        service.submit(new PrintThread('*'));

        service.submit(new PrintThread('$'));

        service.submit(new PrintThread('#'));
        service.shutdown();
        long endTime=System.currentTimeMillis();
        if(service.awaitTermination(15, TimeUnit.SECONDS)) {
            System.out.println("Total time taken = " + (endTime - startTime));
        }
    }
}
