package generics.tutorial;

public class _5_TwoTypes<T,V> {

	private T t;
	private V v;
	public void setValue(T t,V v) {
		this.t=t;
		this.v=v;
	}
	public void print() {
		System.out.println(t+"!!!"+v+"@");
	}
	
	public static void main(String[] args) {
		_5_TwoTypes<String, Double> obj=new _5_TwoTypes<>();
		obj.setValue("Disha Patani", 32.0);
		obj.print();

	}

}
