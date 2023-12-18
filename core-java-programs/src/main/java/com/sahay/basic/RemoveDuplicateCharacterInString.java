package com.sahay.basic;

public class RemoveDuplicateCharacterInString {
	public static String duplicateRemover(String line) {
		StringBuffer buffer=new StringBuffer();
		
		for(int i=0;i<line.length();i++) {
			boolean duplicate=false;
			char c=line.charAt(i);
			for(int j=i+1;j<line.length();j++) {
				if(c==line.charAt(j)) {
					duplicate=true;
				}
			}
			if(duplicate==false) {
				buffer.append(c);
			}
			
		}
		return buffer.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(duplicateRemover("aabcccbdee"));
	}

}
