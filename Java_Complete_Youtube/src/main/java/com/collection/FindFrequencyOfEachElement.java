package com.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfEachElement {
    public static void main(String[] args) {
        List<Integer> nums=List.of(6,7,6,8,9,2,4,7,5,6,2,9);
        Map<Integer, Integer> frequency = frequency(nums);
        System.out.println(frequency);
    }
    public static Map<Integer,Integer> frequency(List<Integer> list){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<list.size();i++){
            int num=list.get(i);
            int count=0;
            for (int j=0;j<list.size();j++){
                if(num==list.get(j))
                    count++;
            }
            map.put(num,count);
        }
        return map;
    }
}
