package com.sahay.sdet_qa;

public class _24_Remove_Special_Char {

	public static void main(String[] args) {
		// Regular expression

		String s="4#@amit&";
		String modified = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(modified);
	}

}
