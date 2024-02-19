package org.example;

public class _31_SumAllOddNumbers {
    public static void main(String[] args) {
        System.out.println(sumOdds(10));//1+3+5+7+9=25
    }
    public static int sumOdds(int range){
        int sum=0;
        int i=1;
        while (i<=range){
            if(i%2==1){
                sum+=i;
            }
            i++;
        }
        return sum;
    }
}
