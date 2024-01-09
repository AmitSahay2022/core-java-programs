package com.sahay.sdet_qa;

import java.util.Arrays;

public class _20_SortArray_Built_In {

	public static void main(String[] args) {
		int[] arr= {2,8,1,4,9,3,3,5,0,1};
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));
	}

}
