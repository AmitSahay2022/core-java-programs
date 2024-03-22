package org.example;

public class _7_Count_Even_odd_In_A_Number {
    public static void main(String[] args) {
        Custom custom = evenOddCounter(87653);
        System.out.println(custom);
    }
    public static Custom evenOddCounter(int number){
        int even=0;
        int odd=0;
        while (number !=0){
            int temp=number%10;
            if(temp%2==0)
                even++;
            else
                odd++;
            number=number/10;
        }
        return new Custom(even,odd);
    }
    public static class Custom{
        private int even;
        private int odd;

        public Custom(int even, int odd) {
            this.even = even;
            this.odd = odd;
        }

        public int getEven() {
            return even;
        }

        public int getOdd() {
            return odd;
        }
        public String toString(){
            return "Total even digits= "+even+" Total Odd Digits= "+odd;
        }
    }
}
