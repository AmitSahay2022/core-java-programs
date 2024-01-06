package com.sahay;

class NumberOfOccurance {
    public static void main(String[] args) {
        int[] numb={5,6,4,2,3,9,4,4,6};
        int n=4; //find occurrence of this number
        int count=0;
        for(int i:numb){
            if(i==n)
                count++;
        }
        System.out.println(count);
    }
}
