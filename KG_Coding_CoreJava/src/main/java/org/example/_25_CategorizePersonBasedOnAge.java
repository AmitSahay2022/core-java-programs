package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
In this program first categorize person based on age (got key value pair)
convert key-value pair into one entity ==entrySet
entrySet object has methods like getKey() and getValue()
use it to categorize person in category like Kids,Adult,Buddhi
 */
public class _25_CategorizePersonBasedOnAge {
    public static void main(String[] args) {
        List<Person> peoples = peoples();
        Map<Integer, List<Person>> map = peoples.stream().collect(Collectors.groupingBy(Person::getAge));
        map.entrySet().stream().forEach(e->{
            if(e.getKey()>18 && e.getKey()<=45){
                System.out.println(e.getValue()+" is Adult");
            }else if(e.getKey()>45){
                System.out.println(e.getValue()+ " is Buddhi ");
            }else {
                System.out.println(e.getValue()+" is Kid");
            }
        });
    }
    public static List<Person> peoples(){
        return Arrays.asList(new Person(20,"Disha"),
                             new Person(30,"Katrina"),
                             new Person(30,"Sunny Leone"),
                             new Person(5,"Choti"),
                             new Person(15,"Badi"),
                             new Person(61,"Buddhi")
        );
    }
    private static class Person{
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
        public String toString(){
            return name+" : "+age;
        }
    }
}
