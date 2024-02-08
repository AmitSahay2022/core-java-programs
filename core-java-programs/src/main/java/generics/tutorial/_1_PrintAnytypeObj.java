package generics.tutorial;
/*
 * Print method can accept any type
 */
public class _1_PrintAnytypeObj {
	
	public static <T> void print(T t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		print(1); 
		print("Amit");
		print(5.8);
		print(5.3f);

	}

}
