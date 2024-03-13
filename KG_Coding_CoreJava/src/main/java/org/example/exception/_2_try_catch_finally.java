package org.example.exception;

public class _2_try_catch_finally {
    public static int devide(int a,int b){
        try{
            int c=a/b;
            System.out.println("Result is: "+c);
            return c;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally Block always execute");
        }
        return 0;
    }
    public static void main(String[] args) {
        devide(5,0);
        devide(10,2);
    }
}
