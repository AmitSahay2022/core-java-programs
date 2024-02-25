package org.example;

public class _52_PalindromeCheck {
    public static void main(String[] args) {
        String name="nitin";
        System.out.println(isPalindrome(name.toCharArray()));
        int[] nums={1,2,3,2,1};
        System.out.println(isPalindrome(nums));
    }
    public static boolean isPalindrome(char[] c){
        for(int i=0;i<c.length/2;i++){
            if(c[i] != c[c.length-1-i])
                return false;
        }
        return true;
    }
    public static boolean isPalindrome(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            if(arr[i] !=arr[arr.length-1-i])
                return false;
        }
        return true;
    }

}
