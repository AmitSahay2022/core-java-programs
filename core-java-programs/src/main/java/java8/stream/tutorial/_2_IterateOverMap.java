package java8.stream.tutorial;

import java.util.HashMap;
import java.util.Map;

public class _2_IterateOverMap {

	public static void main(String[] args) {
		Map<String, Integer> person=new HashMap<>();
		person.put("Amit", 30);
		person.put("Sumit", 28);
		person.put("Sachin", 40);
		person.put("Arti", 21);
		person.entrySet().stream().map(i->i.getValue()+" "+i.getKey()).forEach(System.out::println);
		//Or using biConsumer
		person.forEach((k,v)->System.out.println(k+" : "+v));

	}

}
