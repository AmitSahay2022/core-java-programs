package com.sahay;

import java.util.Arrays;
import java.util.Scanner;

public class _49_Input2DArray {
    public static int[][] input2DArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=scanner.nextInt();
        System.out.println("Enter number of column");
        int col=scanner.nextInt();
        int[][] arr2D=new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("Enter "+(j+1)+" item "+"for "+(i+1)+" row");
                arr2D[i][j]=scanner.nextInt();
            }
        }
        return arr2D;
    }
    public static void main(String[] args) {
        int[][] arr2D = input2DArray();
        System.out.println(Arrays.deepToString(arr2D));
    }
}
