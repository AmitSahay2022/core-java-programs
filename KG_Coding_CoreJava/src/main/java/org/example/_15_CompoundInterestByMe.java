package org.example;
/*
This is a nice code by me to calculate CI
 */
public class _15_CompoundInterestByMe {
    public static void main(String[] args) {
        System.out.println(interest(100000,6,5));
    }
    public static double interest(double principle,double rateOfInterest,int year){
        double ci=0;
        double nowPrinciple=principle;
        int i=year;

        while (i>0){
            double calculate = calculate(nowPrinciple, rateOfInterest);
            nowPrinciple=calculate;
            i--;
        }
        return nowPrinciple-principle;
    }
    private static double calculate(double p,double r){
        double afterYearEnd=p;
        afterYearEnd+=(afterYearEnd*r)/100;
        return afterYearEnd;
    }
}
