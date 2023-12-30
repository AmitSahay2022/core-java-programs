package com.sahay;
/* print this shape using loops
      *
    * *
  * * *
* * * *
 */
public class Pattern3 {
    public static void main(String[] args) {
        int space=6;
        for(int i=0;i<4;i++){
           //First inner loop to print space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //This inner loop is to print *
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            space-=2;
            System.out.println();
        }
    }
}
