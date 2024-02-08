package generics.tutorial;

import java.util.Arrays;
import java.util.List;
/*
 * ? or wildCard is used for type safe Collection
 */
public class _7_AnimalList {
	//--------This is not type safe, in this collection any type of animal can be added---------
	public static void print(List<Animal> list) {
		list.stream().forEach(System.out::println);
	}
	
	public static void printList(List<? extends Animal> list) {
		for(Animal a:list) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		List<Animal> animal1=Arrays.asList(new Dog(),new Cat(),new Dog(),new Cat());
		
		List<Cat> cats=Arrays.asList(new Cat(),new Cat(),new Cat());
        _7_AnimalList.printList(cats);
	}

}
