package java8.stream.tutorial;

import java.util.List;

public class _5_TaxPayingEmployee {

	public static void main(String[] args) {
		List<Employee> list = Database.list();
		list.stream().filter(e->e.getSalary()>50000).forEach(e->System.out.println(e));

	}

}
