package org.example._97_executerService;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String > {
    private String name;
    public CallableDemo(String name){
        this.name=name;
    }
    @Override
    public String call() throws Exception {
        System.out.println("... Finding full name from server...");
        Thread.sleep(5000);
        return name+" Bal Krishna";
    }
}
