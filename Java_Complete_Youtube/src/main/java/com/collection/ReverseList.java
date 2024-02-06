package com.collection;

import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        reverse(list);
        System.out.println(list);
    }
    public static void reverse(List<Integer> list){
        int last=list.size()-1;
        for(int i=0;i<list.size()/2;i++){
            int temp=list.get(i);
            list.set(i,list.get(last));
            list.set(last,temp);
            last--;
        }
    }
}
