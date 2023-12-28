package com.sahay.kgCoding;

public class PrimeChecker {
	public static boolean isPrime(int num) {
		boolean result= true;
		int count=0; //we know the count will be increased because every number is divisible by itself
		if(num<2) { //if number is 1 return true
			return result;
		}
		
		int i=2; // ignore 1 and start from 2 to the number itself
		while(i<=num) {
			if(num % i==0) {
				count++;     //if it is divisible by anyone than increase the count
			}
			i++;
		}
		if(count==1) {  //if count=1 means it is divisible by itself only than return true
			return true;
		}else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(isPrime(11)); 
	}

}
