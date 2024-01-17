package com.sahay;

public class _51_SumOfDiagonals2DArray {
    public static int sum(int[][] arr){
        int sumOfLeftD=0;
        int sumOfRightD=0;
        int i=0;
        int row= arr.length;
        int col=0;
        while (i< arr.length){
            int j=0;
            while (j<arr[i].length){
                col=arr[i].length;
                if(row!=col){
                    System.out.println("Sum of Diagonal con not be found, size is not homogenious");
                    return 0;
                }
                if(i==j){
                    sumOfLeftD+=arr[i][j];
                }
                if(i+j == arr.length-1) {
                    sumOfRightD += arr[i][arr.length-1 - i];
                }
                j++;
            }
            i++;
        }
        if(arr.length %2==0){
            System.out.println(sumOfLeftD+sumOfRightD);
            return sumOfLeftD+sumOfRightD;
        }else{
            int mid= arr.length/2;
            System.out.println(sumOfRightD+sumOfLeftD-arr[mid][mid]);
            return sumOfRightD+sumOfLeftD-arr[mid][mid];
        }


    }

    public static void main(String[] args) {
        int[][] arr={{2,3,4},
                     {3,4,5},
                     {2,8,9}};
        int[][] arr2={{2,6},
                      {8,3}};
        sum(arr2);
        sum(arr);
    }
}
