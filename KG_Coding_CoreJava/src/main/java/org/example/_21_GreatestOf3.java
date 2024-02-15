package org.example;

public class _21_GreatestOf3 {
    public static void main(String[] args) {
        System.out.println(greatest(4,4,2));
        System.out.println(greatest(7,6,0));
        System.out.println(greatest(4,6,3));
    }
    public static String greatest(int first,int second,int third){
        return first>=second && first>=third ?"First number is greatest": second>first && second >third? "Second is greatest":"Third is Greatest";
    }
}
