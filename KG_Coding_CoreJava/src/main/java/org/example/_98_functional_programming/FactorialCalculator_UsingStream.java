package org.example._98_functional_programming;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialCalculator_UsingStream {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        //-------------------------
        IntStream stream=IntStream.rangeClosed(2,num);
        stream.reduce((n1, n2) -> n1 * n2).ifPresent(System.out::println);
    }
    //IntStream ?
    //it returns a stream of integer
}
