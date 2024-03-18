package org.example._95_exception;

public class CustomException_By_Extending_Exception extends Exception{
    public CustomException_By_Extending_Exception(String msg){
        super(msg);
    }

    public static void main(String[] args) throws CustomException_By_Extending_Exception {
        CustomException_By_Extending_Exception exception=new CustomException_By_Extending_Exception("Omg...");
        throw exception;
    }
}
