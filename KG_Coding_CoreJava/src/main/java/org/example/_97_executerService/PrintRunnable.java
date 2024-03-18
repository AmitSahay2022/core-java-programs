package org.example._97_executerService;

public class PrintRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.print((i+1)+" ");
        }
    }
}
