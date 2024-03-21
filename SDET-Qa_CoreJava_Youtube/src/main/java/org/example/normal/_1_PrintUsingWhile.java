package org.example.normal;

public class _1_PrintUsingWhile {
    public static void main(String[] args) {
        int start=1;
        while (start<=10){
            System.out.print(start+" ");
            start++;
        }
        System.out.println("------------");
        //print even between 1 to 10
        int i=1;
        while (i<=10){
            if(i%2==0)
                System.out.print(i+" ");
            i++;
        }
        System.out.println("----------");
        //Print even odd both between 1 to 10
        i=1;
        while (i<=10){
            if(i%2==0)
                System.out.println(i+" Even number");
            else
            System.out.println(i+" Odd Number");
            i++;
        }
        //Print in descending order
        System.out.println("----------------");
        while (i>=0){
            System.out.print(i+" ");
            i--;
        }
    }
}
