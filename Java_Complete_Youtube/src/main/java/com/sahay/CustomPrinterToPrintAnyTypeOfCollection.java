package com.sahay;

import java.util.Collection;

public class CustomPrinterToPrintAnyTypeOfCollection {
    public static <T> void print(Collection<T> collection){
        for(T t:collection){
            System.out.println(t);
        }
    }
}
