package java8.stream.tutorial;

import java.util.HashMap;
import java.util.Map;

public class _4_FilterPersonWhoesAgeIsAbove30 {

	public static void main(String[] args) {
		Map<String, Integer> person=new HashMap<>();
		person.put("Amit", 30);
		person.put("Sumit", 28);
		person.put("Sachin", 40);
		person.put("Arti", 21);
		person.entrySet().stream().filter(e->e.getValue()>=30).forEach(i->System.out.println(i));

	}

}
