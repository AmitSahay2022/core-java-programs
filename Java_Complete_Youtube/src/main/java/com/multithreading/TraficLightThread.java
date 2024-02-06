package com.multithreading;

public class TraficLightThread extends Thread{
    private TraficLight traficLight;
    public TraficLightThread(TraficLight light){
        traficLight=light;
    }

    @Override
    public void run() {
        System.out.println(traficLight);
        try{
            Thread.sleep(traficLight.getTime());
        }catch (InterruptedException e){}
    }

    public static void main(String[] args) throws InterruptedException{
        TraficLightThread thread1=new TraficLightThread(TraficLight.RED);
        TraficLightThread thread2=new TraficLightThread(TraficLight.YELLOW);
        TraficLightThread thread3=new TraficLightThread(TraficLight.GREEN);
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }
}
