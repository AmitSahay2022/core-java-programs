package org.example;

public class _34_LCM_Optimized {
    public static void main(String[] args) {
        System.out.println(lcm(60,20));
    }
    public static int lcm(int num1,int num2){
        int i=1;
        while (true){
            int factor=num1*i;
            if(factor % num2==0){
                return factor;
            }
            i++;
        }

    }
}
