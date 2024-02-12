package concurrency.api;

public class PrintTask implements Runnable{
    private char c;
	public PrintTask(char c) {
		this.c=c;
	}
	@Override
	public void run() {
		System.out.println();
		for(int i=0;i<10;i++) {
			System.out.printf("%c%d ",c,i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Task completed for Thread: "+Thread.currentThread().getName());
		
	}
  
}
