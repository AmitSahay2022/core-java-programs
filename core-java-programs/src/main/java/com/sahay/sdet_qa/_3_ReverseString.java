package com.sahay.sdet_qa;

public class _3_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String word="INDIA";
        System.out.println(reverse(word));
	}
	private static String reverse(String word) {
		StringBuilder sb=new StringBuilder();
		int lastIndex=word.length()-1;
		for(int i=lastIndex;i>=0;i--) {
			sb.append(word.charAt(i));
		}
		
		return sb.toString();
	}

}
