package org.example;
/*
if age<12 discount is 75%
if gender is f discount is 50%
if age > 60 discount is 25%
if gender is f and age<12 than discount is whatever is biggest(75%)
 */
public class _18_ConditionChecks {
    public static void main(String[] args) {
        Person p1=new Person(20,'f');
        Person p2=new Person(9,'m');
        Person p3=new Person(65,'f');
        Person p4=new Person(3,'f');
        System.out.println("Discount for p1= "+calculateDiscountPercentage(p1));
        System.out.println("Discount for p2= "+calculateDiscountPercentage(p2));
        System.out.println("Discount for p3= "+calculateDiscountPercentage(p3));
        System.out.println("Discount for p4= "+calculateDiscountPercentage(p4));
    }
    public static int calculateDiscountPercentage(Person person){
        if(person.getAge()<12){
            return 75;
        }else if(person.getGender()=='f'){
            return 50;
        } else if (person.getAge()>60) {
            return 25;
        }
        return 0;
    }
    private static class Person{
      private int age;
      private char gender;
      public Person(int age,char gerder){
          this.age=age;
          this.gender=gerder;
      }

        public int getAge() {
            return age;
        }

        public char getGender() {
            return gender;
        }
    }
}
