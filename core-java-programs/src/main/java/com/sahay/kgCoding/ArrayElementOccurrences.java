package com.sahay.kgCoding;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementOccurrences {
	
	public static Map<Object, Integer> findOccurrences(Integer[] arr){
		Map<Object,Integer> map=new HashMap<>();
		for(Integer n:arr) {
			Integer count=0;
			for(int i=0;i<arr.length;i++) {
				if(n==arr[i])
					count++;
			}
			map.put(n, count);
		}
		return map;
	}

	public static void main(String[] args) {
		Integer[] num= {1,5,6,2,1,5,5,7};
		System.out.println(findOccurrences(num));

	}

}
