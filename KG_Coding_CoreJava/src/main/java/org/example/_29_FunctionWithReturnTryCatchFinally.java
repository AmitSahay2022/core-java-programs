package org.example;

public class _29_FunctionWithReturnTryCatchFinally {
    public static void main(String[] args) {
        System.out.println(add(5,7));
    }
    public static int add(int a,int b){
        try{
            return a+b;
        }catch (Exception e){}
        finally {
            System.out.println("Finally Block completed");
        }
        return 0;
    }
}
