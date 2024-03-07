package org.example;

public class _78_ArrayToStringToArray {
    public static void main(String[] args) {
        System.out.println(array("Sunny Leone"));
        String[] arr={"This","is","Best","java","course"};
        System.out.println(arrayToString(arr));
    }
    public static char[] array(String str){

        return str.toCharArray();
    }
    public static String arrayToString(String[] arr){
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
        return sb.toString();
    }
}
