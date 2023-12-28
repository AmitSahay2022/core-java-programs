package com.bitwise;

public class BitwiseOperators {
	public static void main(String[] args) {
       int a=5,b=8;
       System.out.println(a & b); //Bitwise and
       System.out.println(b & a);
       System.out.println(a | b); //Bitwise OR
       
       System.out.println(a^b);   //Bitwise XOR
       
       System.out.println(~a);  //Complement/Not operator 
       System.out.println(~b);
	}
}
