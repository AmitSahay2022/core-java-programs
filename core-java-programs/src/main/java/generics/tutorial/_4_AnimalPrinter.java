package generics.tutorial;

public class _4_AnimalPrinter<T extends Animal> {
	private T t;
	
	public void set(T t) {
		this.t=t;
	}
	public void makeSound() {
		t.makeSound();
	}

	public static void main(String[] args) {
		_4_AnimalPrinter<Animal> animal=new _4_AnimalPrinter<>();
		animal.set(new Cat());
		animal.makeSound();
		
		animal.set(new Dog());
        animal.makeSound();
	}

}
