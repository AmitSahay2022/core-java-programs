package com.java_guides;

public class _8_Reverse_Each_Word_Of_String {
    public static void main(String[] args) {
        System.out.println(reverse("Dev Batista"));
    }
    public static String reverse(String word){
        StringBuilder reverse=new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            reverse.append(word.charAt(i));
        }
        return reverse.toString();
    }
}
