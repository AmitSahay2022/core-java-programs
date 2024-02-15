package org.example;
// if(boolean){}
public class _16_If_ElseTutorial {
    public static void main(String[] args) {
        Person person1=new Person(101,"Sumit","Male");
        message(person1);
        Person person2=new Person(102,"Sandhya","Female");
        message(person2);
    }
    public static void message(Person person){
        if(person.getGender().equals("Male")){
            System.out.println("Hello Mr. "+person.name);
        }else {
            System.out.println("Hello Sexy Darling You are So Beautiful");
        }
    }
     private static class Person{
        private int id;
        private String name;
        private String gender;

        public Person(int id, String name, String gender) {
            this.id = id;
            this.name = name;
            this.gender = gender;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }
    }
}
