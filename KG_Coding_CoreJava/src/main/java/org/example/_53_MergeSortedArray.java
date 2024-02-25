package org.example;

import java.util.Arrays;

public class _53_MergeSortedArray {
    public static void main(String[] args) {
        int[] odd={1,3,5,7,9,11};
        int[] even={2,4,6,8,10};
        int[] merged = merger(odd, even);
        System.out.println(Arrays.toString(merged));
    }
    public static int[] merged(int[] arr1,int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<arr1.length || j<arr2.length){
   //यदि arr1 ख़तम नहीं हुआ है और arr1 का i पोजीशन का एलिमेंट arr2 के j पोजीशन के एलिमेंट से chota है या arr2 ख़तम हो गया है
            if((i<arr1.length) && arr1[i]<arr2[j] ||(j>=arr2.length)){
                arr3[k]=arr1[i];
                i++;
                k++;
            }else {
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        return arr3;
    }
    public static int[] merger(int[] arr1,int[] arr2){
        if(arr1.length> arr2.length){
            return merged(arr2,arr1);
        }else
            return merged(arr1,arr2);
    }
}
