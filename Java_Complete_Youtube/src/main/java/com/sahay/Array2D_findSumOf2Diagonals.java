package com.sahay;
/*
 1 2 3
 4 5 6
 7 8 9  in this array L.D elements are 1,5,9 and R.D elements are 3,5,7

        4 5
        8 2 in this array L.D elements are 4,2 and R.D elements are 5,8
 */
public class Array2D_findSumOf2Diagonals {
    public static int sum(int[][] arr){
        int sum=0;
        int sumOfLeftDiago=sumOfLeftDiagonal(arr);
        int sumOfRightDiago=sumOfRightDiagonal(arr);
        sum=sumOfLeftDiago+sumOfRightDiago;
        if(arr.length %2 !=0){    //If array length is odd then midle element is counted twice. (in each methods)
            int mid=arr.length/2;
            sum=sum-arr[mid][mid];
        }

        return sum;
    }
    public static int sumOfLeftDiagonal(int[][] arr){
        int sum=0;
        int i=0;
        while(i<arr.length){
            sum+=arr[i][i];
            i++;
        }
        return sum;
    }
    public static int sumOfRightDiagonal(int[][] arr){
        int sum=0;
        int n=arr.length-1;
        int i=0;
        while (n>=0){
            sum+=arr[i][n];
            i++;
            n--;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sum(arr));
    }
}
