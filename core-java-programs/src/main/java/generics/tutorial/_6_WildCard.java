package generics.tutorial;

import java.util.Arrays;
import java.util.List;

/*
 * Accept any type of List and print it
 *    When we are working with Collection than ? wildCard is used
 */
public class _6_WildCard {
	
	public void printList(List<?> list) {
		list.stream().forEach(i->System.out.println(i));
	}

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		List<String> list2=Arrays.asList("Sumit","Arjun","Krishna","Amit");
		_6_WildCard obj=new _6_WildCard();
		obj.printList(list1);
		obj.printList(list2);

	}

}
