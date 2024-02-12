package org.example;
/*
           *    6 space + 1 star
         * *    4 space + 2 star
       * * *    2 space + 3 star
     * * * *    0 space + 4 star
 */
public class _4_LeftHalfPeramid {
    public static void main(String[] args) {
        int space=6;
        for(int i=0;i<4;i++){
            for(int j=0;j<=space;j++){  //Loop to print space
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* "); //Loop to print * with space
            }
            System.out.println();       //next line
            space-=2;
        }
    }
}
