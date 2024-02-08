package generics.tutorial;

import com.java8.streams._3_ExtractAllDepartmentNames;

/*
 * Generic at class level. We use it in Collection example:
 * List<Integer> list = new ArrayList<>(); 
 */
public class _3_Printer <T> {
    private T t;
    
	public _3_Printer(T t) {		
		this.t = t;
	}

	public void print() {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		_3_Printer<Integer> integerPrinter=new _3_Printer<>(5);
		integerPrinter.print();
		
		_3_Printer<Double> doublePrinter=new _3_Printer<Double>(4.78);
		doublePrinter.print();

	}

}
