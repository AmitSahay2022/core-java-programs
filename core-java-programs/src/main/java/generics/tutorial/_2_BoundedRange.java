package generics.tutorial;
/*
 * action method can accept only those objects which implements Animal 
 */
public class _2_BoundedRange {
	
	public static <T extends Animal> void action(T t) {
		t.makeSound();
	}

	public static void main(String[] args) {
		action(new Dog());
		action(new Cat());

	}

}
