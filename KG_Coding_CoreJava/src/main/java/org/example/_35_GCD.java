package org.example;
//GCD for 4,5 is 1
//GCD for 8,12 is 4
public class _35_GCD {
    public static void main(String[] args) {
        System.out.println(gcd(8,12));
        System.out.println(gcd(6,9,12));
    }
    //GCD for two numbers
    public static int gcd(int num1,int num2){
        int gcd=1;
        int start=1;
        int small=num1>num2 ? num1:num2;
        while (start<=small){
            if((num1 % start==0) && (num2 % start==0) ){
                gcd=start;
            }
            start++;
        }
        return gcd;
    }
    //GCD for 3 numbers
    public static int gcd(int num1,int num2,int num3){
        int gcd=1;
        int start=1;
        int min1 = Math.min(num1, num2);
        int min=Math.min(min1,num3);
        while (start<=min){
            if((num1 %start==0) && (num2%start==0) &&(num3%start==0)){
                gcd=start;
            }
            start++;
        }
        return gcd;
    }

}
