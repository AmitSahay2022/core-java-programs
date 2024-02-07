package java8.stream.tutorial;

import java.util.HashMap;
import java.util.Map;

public class _7_SortMap {

	public static void main(String[] args) {
		Map<String, Integer> person=new HashMap<>();
		person.put("Amit", 30);
		person.put("Sumit", 28);
		person.put("Sachin", 40);
		person.put("Arti", 21);
		//person.entrySet().stream().sorted((o1,o2)->o1.getKey().compareTo(o2.getKey())).forEach(p->System.out.println(p));
		System.out.println("----------Sort Based On Keys------------");
		person.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("----------Sort Based On Values----------");
		person.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}

}
