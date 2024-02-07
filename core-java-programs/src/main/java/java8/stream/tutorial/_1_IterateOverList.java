package java8.stream.tutorial;

import java.util.Arrays;
import java.util.List;

public class _1_IterateOverList {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Amit","Sumit","Amanda","Sachin","Sahwag","Dravid","Ganguly");
		names.stream().forEach(System.out::println);

	}

}
