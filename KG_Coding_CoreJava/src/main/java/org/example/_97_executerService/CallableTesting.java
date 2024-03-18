package org.example._97_executerService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTesting {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FactorialFinder factorial=new FactorialFinder(5);
        FactorialFinder factorial2=new FactorialFinder(4);
        FactorialFinder factorial3=new FactorialFinder(7);
        FactorialFinder factorial4=new FactorialFinder(6);
        try (ExecutorService service = Executors.newFixedThreadPool(2)) {
            Future<Integer> fact1 = service.submit(factorial);
            Future<Integer> fact2 = service.submit(factorial2);
            Future<Integer> fact3 = service.submit(factorial3);
            Future<Integer> fact4 = service.submit(factorial4);

            System.out.println(fact1.get());
            System.out.println(fact2.get());
            System.out.println(fact3.get());
            System.out.println(fact4.get());
        }


    }
}
