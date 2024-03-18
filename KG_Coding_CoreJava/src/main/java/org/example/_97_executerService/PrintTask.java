package org.example._97_executerService;

public class PrintTask<T> implements Runnable{
    private T t;
    public PrintTask(T t){
        this.t=t;
    }
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            try {
                System.out.print(t+" ");
                Thread.sleep(100);
                if(i%20==0)
                    System.out.println();
            }catch (Exception e){}
        }
    }
}
