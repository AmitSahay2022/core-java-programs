package com.sahay;

import java.util.Arrays;

/*
in bubble sort we compare first element with second if first > second.Then swap
if second is > third then swap ....
 */
public class BubbleSort {
    public static int[] sort(int[] array){
        System.out.println("Original Array: "+Arrays.toString(array));
        for (int n=0;n<array.length-1;n++) {  //Why n=0 to n<array.length-1 ? answer: on each pass one item is sorted hence
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                System.out.println("Now Array is: "+Arrays.toString(array));
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] myNumbers={4,5,70,21,3,19,18};
        sort(myNumbers);
    }
}
