package enums.tutorial;

public class Test {

	public static void main(String[] args) {
		Days day0=Days.valueOf("Sun"); //We can receive String object and convert it into enum
		System.out.println(day0);
		
		Days day1=Days.Mon;
		System.out.println(day1.addTwoNumbers(5.7, 9));
		
		System.out.println(day1.getInfo());
		
		Days day6=Days.Sun;
		System.out.println(day6.getInfo());
		
		Gender gender=Gender.Female;
		System.out.println(gender);
		

	}

}
