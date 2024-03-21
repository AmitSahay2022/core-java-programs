package org.example;

public class _3_Reverse_A_String {
    public static void main(String[] args) {
        System.out.println(reverse("Mohan"));
        System.out.println(reverse2("abcd"));
    }
    public static String reverse(String original){
        StringBuilder sb=new StringBuilder();
        char[] originalChars = original.toCharArray();
        for(int i=originalChars.length-1;i>=0;i--){
            sb.append(originalChars[i]);
        }
        return sb.toString();
    }
    public static String reverse2(String str){
        int lastIndex=str.length()-1;
        String reverse="";
        for(int i=lastIndex;i>=0;i--){
           reverse=reverse.concat(str.charAt(i)+"");
        }
        return reverse;
    }
}
