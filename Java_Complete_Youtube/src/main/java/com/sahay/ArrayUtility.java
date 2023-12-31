package com.sahay;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtility {
    public static int[] receaveArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size");
        int size=sc.nextInt();
        int[] array=new int[size];
        int i=0;
        while (i<size){
            System.out.println("Enter "+(i+1)+" element");
            array[i]=sc.nextInt();
            i++;
        }
        System.out.println("Your Array is: "+ Arrays.toString(array));
        return array;
    }
}
