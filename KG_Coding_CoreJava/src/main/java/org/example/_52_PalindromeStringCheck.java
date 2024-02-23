package org.example;

public class _52_PalindromeStringCheck {
    public static void main(String[] args) {
        String s="kane";
        System.out.println(reverse(s));
        System.out.println(isPalindrome("abc"));
    }
    public static boolean isPalindrome(String word){
        String reverse=reverse(word);
        if (word.equals(reverse)) return true;
        return false;
    }
    public static String reverse(String word){
        char[] c=word.toCharArray();  //String to char[]
        for(int i=0;i<c.length/2;i++){
            char temp=c[i];
            c[i]=c[c.length-1-i];
            c[c.length-1-i]=temp;
        }
        return new String(c);  //char[] to String
    }
}
