package org.example;

public class _52_ArrayPalindrome {
    public static void main(String[] args) {
        char[] arr={1,2,'a','b','a',2,1};
        System.out.println(isPalindrome(arr));

    }
    public static boolean isPalindrome(char[] c){
        char[] rev=reverse(c);
        for(int i=0;i<c.length;i++){
            if(rev[i]!=c[i])return false;
        }
        return true;
    }
    public static char[] reverse(char[] c){
        char[] rev=new char[c.length];
        int j=0;
        for(int i=c.length-1;i>=0;i--){
            rev[j++]=c[i];
        }
        return rev;
    }
}
