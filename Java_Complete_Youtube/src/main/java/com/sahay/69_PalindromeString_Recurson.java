package com.sahay;

class PalindromeString_Recurson {
    public static void main(String[] args) {
        System.out.println(isPalindrome("nitin")? "Palindrome":"Not Palindrome");
    }
    public static boolean isPalindrome(String name){
        if(name.length()<=1) return true;
        int firstIndex=0,lastIndex=name.length()-1;
        if(name.charAt(firstIndex) != name.charAt(lastIndex)){
            return false;
        }
        String trimed=name.substring(firstIndex,lastIndex); //now remove first and last
        isPalindrome(trimed); //again call the same method
        return true;
    }
}
