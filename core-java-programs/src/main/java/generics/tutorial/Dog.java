package generics.tutorial;

public class Dog implements Animal{	
  public void makeSound() {
	  System.out.println("boo boo");
  }

@Override
public String toString() {
	return "Dog []";
}
  
}
