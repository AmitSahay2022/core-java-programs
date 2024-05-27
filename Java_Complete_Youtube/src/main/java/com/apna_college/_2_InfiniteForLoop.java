package com.apna_college;

public class _2_InfiniteForLoop {
    public static void main(String[] args) {
        for(int i=0; ; ){
            System.out.print(i+" ");
            i++;
            if(i!=0 && i%25==0)
                System.out.println();
            if(i==75);
                break;
        }
        System.out.println("\nOMG Infinite Loop is possible with for loop");
    }
}
