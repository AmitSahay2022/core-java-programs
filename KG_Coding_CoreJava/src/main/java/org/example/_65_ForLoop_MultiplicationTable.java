package org.example;

public class _65_ForLoop_MultiplicationTable {
    public static void main(String[] args) {
        multiplicationTable(7);
    }
    public static void multiplicationTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
