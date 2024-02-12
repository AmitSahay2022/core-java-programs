package enums.tutorial;

public enum Days {
	Mon("Working Day"),Tue("Working Day"),Wed("Working Day"),Thr("Working Day"),Fri("Working Day"),Sat("Holiday"),Sun("Holiday");
	
	private String info;
	private Days(String info) {
		this.info=info;
	}
	//---------Method-------
	public String getInfo() {
		return "OMG This is "+ this.info;
	}
	
	public double addTwoNumbers(double x,double y) {
		return x+y;
	}
	

}
