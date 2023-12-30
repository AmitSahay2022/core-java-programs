package com.sahay;
/* print this pattern using while loop
*
* *
* * *
* * * *
 */
public class Pattern1Trangle {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){   //This loop will execute for 5 times
            int j=1;
            while(j<=i){  //number of * is equals to number of line(i)
                System.out.print("* ");
                j++;
            }
            System.out.println(); //After each outer loop iteration it will print nuw line
            i++;
        }
    }
}
