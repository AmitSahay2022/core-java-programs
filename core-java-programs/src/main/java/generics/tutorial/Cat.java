package generics.tutorial;

public class Cat implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Meao meao");

	}

	@Override
	public String toString() {
		return "Cat []";
	}

}
