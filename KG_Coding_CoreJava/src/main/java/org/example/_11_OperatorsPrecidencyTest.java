package org.example;
// BODMAS
//B= bracket i.e. ()
//O= order
//D= Division M= Multiplication
//A= Addition S= Substraction
public class _11_OperatorsPrecidencyTest {
    public static void main(String[] args) {
        System.out.println(8-3*3); //-1
        System.out.println((8-3)*3); //15
        System.out.println(9/3/3); //1 -> means from LHS to RHS
        System.out.println(9/(3/3));//9
    }
}
