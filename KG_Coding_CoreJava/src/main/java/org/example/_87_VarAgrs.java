package org.example;

public class _87_VarAgrs {
    public static String concatenate(String...names){
        StringBuilder builder=new StringBuilder();
        for(String n:names){
            builder.append(n+"... ");
        }
        System.out.println(builder);
        return builder.toString();
    }

    public static void main(String[] args) {
        concatenate("Ram","Shyam","Mohan","Radha","Gopal","Krishna");
    }
}
