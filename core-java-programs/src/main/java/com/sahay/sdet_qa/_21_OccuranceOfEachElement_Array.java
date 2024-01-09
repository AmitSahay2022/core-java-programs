package com.sahay.sdet_qa;

import java.util.HashMap;
import java.util.Map;

public class _21_OccuranceOfEachElement_Array {

	public static void main(String[] args) {
		Map<Integer, Integer> map=new HashMap<>();
		int[] arr= {1,2,3,5,2,1,6,2};
		for(int i=0;i<arr.length;i++) {
			Integer n=arr[i];
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(n.intValue()==arr[j]) {
					count++;
				}
			}
			map.put(n, count);
		}
		System.out.println(map);

	}

}
