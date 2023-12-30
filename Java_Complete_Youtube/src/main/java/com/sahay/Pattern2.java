package com.sahay;
/*ptint below shape using loop
* * * * *
* * * *
* * *
* *
*
 */
public class Pattern2 {
    public static void main(String[] args) {
        int noOfStars=5;
        for (int i=0;i<5;i++){
            for (int j=0;j<noOfStars;j++){
                System.out.print("* ");
            }
            System.out.println();
            noOfStars--;
        }
    }
}
