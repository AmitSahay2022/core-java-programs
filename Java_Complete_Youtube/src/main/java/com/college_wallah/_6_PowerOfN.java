package com.college_wallah;

public class _6_PowerOfN {
    public static void main(String[] args) {
        System.out.println(pow(5,3)); //5x5x5=125
    }
    public static int pow(int x,int n){
        int pow=1;
        int i=1;
        while (i<=n){
            pow=pow*x;
           // System.out.println(pow);
            i++;
        }
        return pow;
    }
}
