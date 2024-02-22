package org.example;

import java.util.Arrays;
import java.util.Scanner;

//3 students each has 3 subjects
public class _44_2DArray {
    public static void main(String[] args) {
        int[][] marks=new int[3][3];
        Scanner input=new Scanner(System.in);
        int i=0;
        while (i<marks.length){
            int j=0;
            while (j<marks[i].length){
                System.out.println("Enter marks of "+(i+1)+" th Student");
                marks[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        System.out.println(Arrays.deepToString(marks));
    }
}
