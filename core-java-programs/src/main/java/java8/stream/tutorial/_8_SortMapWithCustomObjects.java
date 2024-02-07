package java8.stream.tutorial;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class _8_SortMapWithCustomObjects {

	public static void main(String[] args) {
		Map<Employee, Integer> map=new HashMap<>();
		map.put(new Employee(176, "Manoj", "IT", 60000), 60);
		map.put(new Employee(182, "Amanda", "CSE", 47653), 47);
		map.put(new Employee(192, "Anjali", "CSE", 27653), 27);
		map.put(new Employee(122, "Sachin", "IT", 37653), 37);
		map.put(new Employee(190, "Amit", "CSE", 97653), 97);
		
		map
		   .entrySet()
		   .stream()
		   .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
		   .forEach(System.out::println);

	}

}
