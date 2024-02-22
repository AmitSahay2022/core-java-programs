package org.example;

public class _41_Pattern {
    public static void main(String[] args) {
       pattern1();
        System.out.println("--------------------");
       pattern2();
        System.out.println("--------------------");
        pattern3();
    }
    public static void pattern1(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(){
        int start=5;
        for(int i=0;i<5;i++){
            for (int j=0;j<start-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(){
        int space=8;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
            space=space-2;
        }
    }
}
