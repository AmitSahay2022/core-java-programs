package java8.stream.tutorial;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _6_SortingEmployeeBasedOn {

	public static void main(String[] args) {
		List<Employee> list = Database.list();
		list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(e->System.out.println(e));
		//Sort based on name
		Collections.sort(list,(e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println(list);

	}

}
