package org.example;
//if else if etc. executes only once if condition is true
//while, for etc. are loops which will continue executing as long as condition is true
public class _27_Loop {
    public static void main(String[] args) {
        int x=5;
        while(x>0){
            System.out.print("जय श्री राम  ");
            x--;
        }
        System.out.println("-----------ॐ नमः शिवाय-----------");
        //Print जय श्री राम 108 times
        for(int i=0;i<108;i++){
            System.out.print((i+1)+" जय श्री राम  ");
        }
        System.out.println("-----------Print 108 times Shiv Mantra using while---------------");
        int i=1; //initialization
        while (i<=108){ //condition
            System.out.println(i+"  नमः शिवाय");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            if(i%10==0){
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){}
            }
            i++; //update condition
        }
    }
}
