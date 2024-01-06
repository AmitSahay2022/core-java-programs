package com.sahay;

class Sum_All_Positive_Numbers {
    public static void main(String[] args) {
        int[] num={-7,8,4,2,-9,0,-4,5};
        int sum=0;
        for(int i:num){
            if(i<0)
                continue;
            else {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
