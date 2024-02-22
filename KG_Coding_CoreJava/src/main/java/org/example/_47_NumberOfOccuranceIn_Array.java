package org.example;

import java.util.HashMap;
import java.util.Map;

public class _47_NumberOfOccuranceIn_Array {
    public static void main(String[] args) {
        int[] arr={3,4,3,2,5,6,7,4,9};
        System.out.println(occurance(arr,3));
        System.out.println(occurance(arr));
    }
    public static int occurance(int[] arr,int num){
        int times=0;
        for(int x:arr){
            if(x==num)
                times++;
        }
        return times;
    }
    public static Map<Integer,Integer> occurance(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(x==arr[i])
                    count++;
            }
            map.put(x,count);
        }
        return map;
    }
}
