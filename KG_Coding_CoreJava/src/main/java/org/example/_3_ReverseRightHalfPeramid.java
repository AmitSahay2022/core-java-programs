package org.example;
/*
  * * * *   4
  * * *     3
  * *       2
  *         1
 */
public class _3_ReverseRightHalfPeramid {
    public static void main(String[] args) {
       int i=4;
       while(i>=0){
           for(int j=0;j<i;j++){
               System.out.print("* ");
           }
           System.out.println();
           i--;
       }
    }
}
