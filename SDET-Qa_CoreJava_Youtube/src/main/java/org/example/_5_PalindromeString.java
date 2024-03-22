package org.example;

public class _5_PalindromeString {
    public static void main(String[] args) {
        String name="nitin";
        String rev=reverse(name);
        if(name.equals(rev)){
            System.out.println("Palindrome");
        }else
            System.out.println("Oops");
    }
    public static String reverse(String original){
        StringBuilder rev=new StringBuilder();
        char[] arr=original.toCharArray();
        for(int i= arr.length-1;i>=0;i--){
            rev.append(arr[i]);
        }
        return rev.toString();
    }
}
