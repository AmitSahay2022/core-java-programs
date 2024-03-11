package org.example.call_by_value_reference;

public class CallByValue {
    private int a;
    private int b;

    public CallByValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void sum(){
        a+=b;
        System.out.println(a);
    }

    public static void main(String[] args) {
        CallByValue byValue=new CallByValue(5,10);
        System.out.println("a = "+byValue.a);
        System.out.println("b = "+byValue.b);
        byValue.sum();
    }
}
