package org.example.executerService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableDemo demo1=new CallableDemo("Amit");
        CallableDemo demo2=new CallableDemo("Arti");
        ExecutorService service= Executors.newFixedThreadPool(2);
        Future<String> full_name1 = service.submit(demo1);
        Future<String> full_name2 = service.submit(demo2);
        System.out.println(full_name1.get()+" "+full_name2.get());
        service.shutdown();
    }
}
