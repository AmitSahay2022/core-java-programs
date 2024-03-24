package com.college_wallah;
//1-2+3-4+5....n
//even -
//odd +
public class _4_SumOfASeries {
    public static void main(String[] args) {
        System.out.println(sum(5));//1-2+3-4+5-6+7-8+9-10
    }
    public static int sum(int range){
        int sum=0;
        int i=1;
        while (i<=range){
            if(i%2==0)
                sum=sum-i;
            else
                sum=sum+i;
            i++;
        }
        return sum;
    }
}
