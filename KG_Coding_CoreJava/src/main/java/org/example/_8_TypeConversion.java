package org.example;

public class _8_TypeConversion {
    public static void main(String[] args) {
        float f=5; //automatic type conversion (small to big)
        float f2=(float)5d; //explicit == manually type conversion (big to small)
        int i=(int)8.2;
        System.out.println(f);
        System.out.println(f2);
        System.out.println(i);
    }
}
