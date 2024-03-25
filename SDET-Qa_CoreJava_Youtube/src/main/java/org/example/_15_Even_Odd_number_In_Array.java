package org.example;

public class _15_Even_Odd_number_In_Array {
    public static void main(String[] args) {
        int[] arr={4,3,2,6,7,8};
        evenOdd(arr);
    }
    public static void evenOdd(int[] arr){
        for(int i:arr){
            if(i%2== 0){
                System.out.println(i+" is Even");
            }else
                System.out.println(i+" is Odd");
        }
    }
}
