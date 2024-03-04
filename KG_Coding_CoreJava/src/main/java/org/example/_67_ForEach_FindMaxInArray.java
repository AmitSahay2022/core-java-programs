package org.example;

public class _67_ForEach_FindMaxInArray {
    public static void main(String[] args) {
        int[] arr={5,9,1,7,8};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        if(arr.length<1) return 0;
        int max=arr[0];
        for(int i:arr){
            if(max<i)
                max=i;
        }
        return max;
    }
}
