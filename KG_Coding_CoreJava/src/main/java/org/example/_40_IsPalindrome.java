package org.example;

public class _40_IsPalindrome {
    public static void main(String[] args) {
        String result = isPalindrome(585) ? "Palindrome Number" : "Not Palindrome";
        System.out.println(result);
    }
    public static boolean isPalindrome(int num){
        int rev=reverse(num);
        if(rev==num) return true;
        return false;
    }
    public static int reverse(int num){
        int rev=0;
        while (num>0){
            rev=rev*10 + num%10;
            num=num/10;
        }
        return rev;
    }
}
