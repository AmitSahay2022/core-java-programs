package org.example.executerService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        PrintTask task1=new PrintTask<>("#");
        PrintTask task2=new PrintTask<>('@');
        PrintTask task3=new PrintTask<>("$");
        PrintTask task4=new PrintTask("%");
        PrintTask task5=new PrintTask<>('A');
        PrintTask task6=new PrintTask<>(5);
        PrintTask task7=new PrintTask<>(8.0);
        ExecutorService service=Executors.newFixedThreadPool(3);
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task4);
        service.submit(task5);
        service.submit(task6);
        service.submit(task7);
        service.shutdown();

        if(!service.awaitTermination(10, TimeUnit.SECONDS)){
            service.shutdownNow();
        }

    }
}
