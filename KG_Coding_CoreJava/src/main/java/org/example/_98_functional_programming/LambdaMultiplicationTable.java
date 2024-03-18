package org.example._98_functional_programming;

import java.util.Scanner;
import java.util.function.Consumer;

public class LambdaMultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number for multiplication table");
        int in = input.nextInt();
        Consumer<Integer> table=n->{
          for (int i=1;i<=10;i++){
              System.out.println(in+" x "+i+" = "+in*i);
          }
        };
        table.accept(in);
    }
}
