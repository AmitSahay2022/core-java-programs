package org.example;

public class _14_Sum_Of_All_Elements_In_Array {
    public static void main(String[] args) {
        int[] arr={5,9,7,8};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr){
        int total=0;
        for(int i:arr){
            total+=i;
        }
        return total;
    }
}
