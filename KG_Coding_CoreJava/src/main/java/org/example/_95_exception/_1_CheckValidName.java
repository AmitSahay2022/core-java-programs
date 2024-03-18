package org.example._95_exception;

public class _1_CheckValidName {
                                      //throws->means this method might throw exception
    public static void takeName(String userName) throws IllegalArgumentException{
        if(userName.contains("-")||userName.contains("$")){
            throw new IllegalArgumentException("Invalid User name"); //to throw actual exception
        }
        System.out.println(userName);
    }
    public static void main(String[] args) {
        
        takeName("Amit$");
        System.out.println("Main method code");
    }
}
