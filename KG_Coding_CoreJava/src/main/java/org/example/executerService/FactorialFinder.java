package org.example.executerService;

import java.util.concurrent.Callable;

public class FactorialFinder implements Callable<Integer> {
    private Integer n;
    public FactorialFinder(Integer n){
        this.n=n;
    }
    @Override
    public Integer call() throws Exception {
        Thread.sleep(4000);
        return factorial(n);
    }
    public int factorial(int n){
        int result=1;
        if(n<=1) return 1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }
}
