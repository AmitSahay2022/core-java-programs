package com.sahay.kgCoding;

import java.util.Arrays;

public class ArrayMarge2SortedArray {
	public static int[] marge(int[] arr1,int[] arr2) {
		int newSize=arr1.length+arr2.length;
		int [] margedArray=new int[newSize];
		int i=0,j=0,k=0;
		int imax=arr1.length-1;
		int jmax=arr2.length-1;
		while(i<=imax || j<jmax) {
	 /* j ख़तम को गया है   या  जबतक i ख़तम नहीं हुआ है तथा arr1[i] और arr2[j] से छोटा है    */
			if(j>jmax ||(i<=imax) && arr1[i]<arr2[j]) { //अगर j ख़तम हो गया है अर्थात दूसरा array ख़तम हो गया तब else ब्लॉक में मत जाओ 
				margedArray[k]=arr1[i]; //ये कोड पहले array (arr1) के एलिमेंट को ऐड करने के लिया है  
				k++; //यहाँ k बढ़ रहा है 
				i++;
			}else {  //ये कोड दूसरे array (arr2) ने एलिमेंट को ऐड करने के लिया है 
				margedArray[k]=arr2[j];
				j++;  //यहाँ j बढ़ रहा है 
				k++;
			}
		}
		return margedArray;
		
	}

	public static void main(String[] args) {
		int[] arr1={2,3,4,8};
        int[] arr2={1,5,7,9,10};
		int[] num1= {1,3,5,7,9,88,99,123,200};
		int[] num2= {2,4,6,8,10,11,34};
        System.out.println(Arrays.toString(marge(num1, num2)));
        System.out.println(Arrays.toString(marge(arr1, arr2)));
		marge(num1, num2);
	}

}
