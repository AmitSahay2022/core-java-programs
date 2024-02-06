package com.multithreading;

public enum TraficLight {
    RED("Stop",6000),GREEN("Go",5000),YELLOW("Caution",3000);
    private String light;
    private int time;
    TraficLight(String light,int time){
        this.light=light;
        this.time=time;
    }
    public int getTime(){
        return time;
    }

}
