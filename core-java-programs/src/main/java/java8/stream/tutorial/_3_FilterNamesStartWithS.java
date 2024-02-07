package java8.stream.tutorial;

import java.util.Arrays;
import java.util.List;

public class _3_FilterNamesStartWithS {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Amit","Sumit","Amanda","Sachin","Sahwag","Dravid","Ganguly");
		//Traditional Way
        for(String n:names) {
        	if(n.startsWith("S")) {
        		System.out.println(n);
        	}
        }
        System.out.println("--------Java 8 way-----------------");
        names.stream().filter(n->n.startsWith("S")).forEach(System.out::println);
	}

}
