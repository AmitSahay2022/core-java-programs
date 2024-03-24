package org.example.normal;

public class Continue_Return {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if(i%5==0) {
                System.out.println("continue just skip the current iteration");
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i=0;i<=10;i++){
            if(i==7)
                break;
            System.out.print("* "+i);
        }
        System.out.println("break just break the loop");
        for (int i=0;i<10;i++){
            System.out.println(i+" @");
            if(i==5)
                return; //Because of return last line will not execute
        }
        System.out.println("I will not execute because of return");
    }
}
