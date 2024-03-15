package org.example.executerService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    public static void main(String[] args) {
        PrintRunnable runnable=new PrintRunnable();
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            service.submit(runnable);
        }
    }
}
