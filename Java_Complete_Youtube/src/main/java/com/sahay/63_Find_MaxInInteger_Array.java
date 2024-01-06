package com.sahay;

class Find_MaxInInteger_Array {
    public static void main(String[] args) {
        int[] numbers={4,7,2,8,5,4,8,9,15,3};
        int max=numbers[0];
        for(int n:numbers){
            if(max<n)
                max=n;
        }
        System.out.println("Maximum = "+max);
    }
}
