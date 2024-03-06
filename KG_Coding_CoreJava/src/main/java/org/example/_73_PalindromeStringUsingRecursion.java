package org.example;

public class _73_PalindromeStringUsingRecursion {
    public static void main(String[] args) {
        System.out.println(isPalindrome("nitin"));
    }
    public static boolean isPalindrome(String str){
        if(str.length()<=1)
            return true;
        int lastIndex=str.length()-1;
        if(str.charAt(0) !=str.charAt(lastIndex))
            return false;
        String sub=str.substring(1,lastIndex);
        return isPalindrome(sub);
    }
}
