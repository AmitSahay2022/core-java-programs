package org.example;
/* case 1
 5 9 2
 4 5 1
 8 7 0
 case 2
 4 5
 9 1
 */
public class _55_SumOf2Diagonals {
    public static void main(String[] args) {
       int[][] arr1={{5,9,2},{4,5,1},{8,7,0}};

        System.out.println(sumOfLeftDiagonal(arr1));

        System.out.println(sumOfRightDiagonal(arr1));

        System.out.println(sumOfBothDiagonals(arr1));
         int[][] arr2={{4,5},{9,1}};
         System.out.println(sumOfLeftDiagonal(arr2));
         System.out.println(sumOfRightDiagonal(arr2));
         System.out.println(sumOfBothDiagonals(arr2));
    }
    public static int sumOfRightDiagonal(int[][] arr){
        if(arr.length<=0){
            return 0;
        }
        if(arr[0].length !=arr.length){
            return 0;
        }
        int sum=0;
        int i=0;
        while (i<arr.length){
            sum+=arr[i][i];
            i++;
        }
        return sum;
    }
    public static int sumOfLeftDiagonal(int[][] arr){
        if(arr.length<=0) return 0;
        if(arr[0].length != arr.length) return 0;
        int sum=0;
        int i=0;
        int j=arr.length-1;
        while (i<arr.length){
            sum+=arr[i][j-i];
            i++;
        }
        return sum;
    }
    public static int sumOfBothDiagonals(int[][] arr){
        int sum1=sumOfLeftDiagonal(arr);
        int sum2=sumOfRightDiagonal(arr);
        if(arr.length %2 != 0){
            int midIndex=arr.length/2;
            return sum1+sum2-arr[midIndex][midIndex];
        }
        return sum1+sum2;
    }
}
