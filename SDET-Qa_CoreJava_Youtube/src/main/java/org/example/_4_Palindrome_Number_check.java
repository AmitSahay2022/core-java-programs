package org.example;

public class _4_Palindrome_Number_check {
    public static void main(String[] args) {
        int num=102;
        int rev=reverse(num);
        if(num==rev){
            System.out.println("Palindrome");
        }else {
            System.out.println("Oh no");
        }
    }
    public static int reverse(int original){
        int rev=0;
        while (original!=0){
            rev=rev*10+original%10;
            original=original/10;
        }
        return rev;
    }
}
