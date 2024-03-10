package org.example._82;

import java.util.Arrays;

public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    private class Statistic{
        public double mean(){
            double sum=0;
            int countItem=0;
            for(int n:numbers){
                sum+=n;
                countItem++;
            }
            return sum/countItem;
        }
        public double median(){
            //Sort the array than return middle element
            for(int i=0;i<numbers.length-1;i++){
                for(int j=i+1;j<numbers.length;j++){
                    if(numbers[i]>numbers[j]){
                        int temp=numbers[i];
                        numbers[i]=numbers[j];
                        numbers[j]=temp;
                    }
                }
            }
            System.out.println("After Bubble sorting array is:");
            System.out.println(Arrays.toString(numbers));
            int n=numbers.length;
            if(n %2==0){
                int mid1=numbers[n/2-1];
                int mid2=numbers[n/2];
                return (mid1+mid2)/2;
            }
            else
            return numbers[numbers.length/2];
        }
    }

    public static void main(String[] args) {
        int[] arr={5,7,3,9,23,45,21,7,22,3};
        ArrayOperations operations=new ArrayOperations(arr);
        ArrayOperations.Statistic statistic=operations.new Statistic();
        System.out.println(statistic.mean());
        System.out.println(statistic.median());
    }
}
