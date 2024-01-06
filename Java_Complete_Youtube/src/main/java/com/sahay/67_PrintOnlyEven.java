package com.sahay;

class PrintOnlyEven {
    public static void main(String[] args) {
        int[] num={1,2,3,5,6,7,8,9,11,22};
        for(int i:num){
            if(i%2==0){
                System.out.print(i+" ");
            }else
                continue;
        }
    }
}
