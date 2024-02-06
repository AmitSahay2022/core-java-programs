package com.enums;

public enum TraficLight {
    RED("Stop"),GREEN("Go"),YELLOW("Slow");
    private String message;
    TraficLight(String message){
        this.message=message;
    }
}
