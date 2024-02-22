package org.example;
/*
153 is armstrong because 1x1x1+5x5x5+3x3x3=153
1634 is armstrong 1x1x1x1=   1
                  6x6x6x6=1296
                  3x3x3x3=  81
                  4x4x4x4= 256
                  ----------------
                          1634
from 1-9 all are armstrong
 */
public class _39_ArmstrongCheck {
    public static void main(String[] args) {
        boolean armstrong = isArmstrong(1635);
        String result = armstrong ? "***Armstrong number*** " : "!Not an Armstrong";
        System.out.println(result);
    }

    public static boolean isArmstrong(int numb){
        int original=numb;
        if(numb>0 && numb<10) return true;
        int numberOfDigits = numberOfDigits(numb);
        int total=0;
        while (numb>0){
            int n=numb%10;
            total+=power(n,numberOfDigits);
            numb/=10;
        }
        if(original==total) return true;
        return false;
    }
    public static int numberOfDigits(int num){
        int total=0;
        while (num>0){
            total++;
            num=num/10;
        }
        return total;
    }
    public static int power(int num,int pow){
        int result=1;
        int start=1;
        while (start<=pow){
            result=result*num;
            start++;
        }
        return result;
    }
}
