package org.example;
//Relational operator is lowest precidency means it will evaluate after + or -
public class _17_RelationalOperators {
    public static void main(String[] args) {
        int x=10;
        int y=10;
        double z=10;
        System.out.println(x==y);
        System.out.println(x==z);
        System.out.println(4!=3);//True
        System.out.println(5>6);//false
        System.out.println(3<9);//true
        System.out.println(8+4>8+2);
        System.out.println("Is illegible for DL: "+isIllegibleForDL(3));
    }
    public static boolean isIllegibleForDL(int age){
        return age>=18?true:false;
    }
}
