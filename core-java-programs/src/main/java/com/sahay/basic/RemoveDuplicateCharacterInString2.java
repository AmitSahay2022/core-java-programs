package com.sahay.basic;

public class RemoveDuplicateCharacterInString2 {

	public static void main(String[] args) {
		String str="Programming";
		StringBuilder sb=new StringBuilder();
		//distinct() returns only unique items
		str.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);
	}

}
