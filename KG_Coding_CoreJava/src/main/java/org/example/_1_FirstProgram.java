package org.example;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _1_FirstProgram {
   public static void main(String...args){
       System.out.println("Hello World By KGCoding");
       //Print Squire of user provided number
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a number");
       int i = s.nextInt();
       Function<Integer,Integer> squire= n->n*n;
       System.out.println(i+" * "+i+" = "+squire.apply(i));
       BiFunction<Integer,Integer,Integer> power=(n,m)->n*m;
       System.out.println("Enter two numbers");
       int num1=s.nextInt();
       int num2=s.nextInt();
       System.out.println("Multiplication of "+num1+" "+num2+" = "+power.apply(num1,num2));
   }

}