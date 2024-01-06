package com.sahay;

import java.util.Scanner;

class RunALoopUntil_x_isPressed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter x for exit");
            char c=sc.next().charAt(0);
            if(c=='x'){
                break; // return will also work
            }
        }
    }
}
