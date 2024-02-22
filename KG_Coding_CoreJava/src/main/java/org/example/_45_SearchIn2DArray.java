package org.example;

public class _45_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] data={{4,5,6},{3},{7,9},{23,54,21,45}};
        //Find out if 54 is present in the above array?
        String result=isPresent(data,52)?"Item Found":"Oops! not there";
        System.out.println(result);
    }
    public static boolean isPresent(int[][] arr,int item){
        for(int[] ar:arr){
            for(int n:ar){
                if(n==item)return true;
            }
        }
        return false;
    }
}
