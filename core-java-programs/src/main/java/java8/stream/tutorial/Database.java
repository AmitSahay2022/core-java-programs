package java8.stream.tutorial;

import java.util.Arrays;
import java.util.List;

public class Database {
  public static List<Employee> list(){
	  List<Employee> employees=Arrays.asList(
			  new Employee(176, "Manoj", "IT", 60000),
			  new Employee(182, "Amanda", "CSE", 47653),
			  new Employee(192, "Anjali", "CSE", 27653),
			  new Employee(122, "Sachin", "IT", 37653),
			  new Employee(190, "Amit", "CSE", 97653)
			  );
	  return employees;
  }
}
