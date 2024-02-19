package org.example;

public class _34_LCMAgain {
    public static void main(String[] args) {
        System.out.println(lcm(15,20));
    }
    public static int lcm(int num1,int num2){
        int lcm=1;
        //We do not know at which point it will meet hence infinite loop
        while (true){
            if((lcm % num1==0) && (lcm % num2==0)) {
                return lcm;
            }
            lcm++;
        }

    }
}
