package org.example;
//LCM=Lowest common multiple i.e. LCM of 5,7 is 35. LCM of 4,6 is 12
public class _34_LCM {
    public static void main(String[] args) {
        System.out.println(lcm(5,7));
    }
    public static int lcm(int num1,int num2){
        int lcm=1;

        while (true){
            if(lcm%num1==0 && lcm%num2==0) {
                return lcm;
            }
            lcm++;
        }

    }
}
