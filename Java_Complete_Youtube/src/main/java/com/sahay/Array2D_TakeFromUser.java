package com.sahay;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D_TakeFromUser {
    public static int[][] take2DArray(int row,int col){
        int[][] array2D=new int[row][col];
        Scanner sc=new Scanner(System.in);
       for(int i=0;i<row;i++){
           System.out.println("Enter "+(i+1)+" Array elements");
           for(int j=0;j<col;j++){
               array2D[i][j]=sc.nextInt();
           }
       }
        return array2D;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(take2DArray(3,3)));
    }
}
