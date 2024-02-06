package com.collection;

import java.util.Arrays;
import java.util.List;

public class SwapElementsInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5);
        swap(list,1,4);
        System.out.println(list);
    }
    public static void swap(List<Integer> list,int indexi,int indexj){
        if(indexj>list.size()-1 || indexi>list.size()-1){
            System.out.println("Index out of bound!");
            return;
        }
        int temp=list.get(indexi);
        list.set(indexi, list.get(indexj));
        list.set(indexj,temp);
    }
}
