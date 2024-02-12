package concurrency.api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		PrintTask task1=new PrintTask('$');
		PrintTask task2=new PrintTask('#');
		PrintTask task3=new PrintTask('@');
		PrintTask task4=new PrintTask('*');
		
		long startTime = System.currentTimeMillis();
		
		ExecutorService service=Executors.newFixedThreadPool(4);
		service.submit(task1);
		service.submit(task2);
		service.submit(task3);
		service.submit(task4);
		service.shutdown();
		
		long endTime = System.currentTimeMillis();
		
		 
		if(!service.awaitTermination(5, TimeUnit.SECONDS)) {
			
			System.out.println("Oops ! Timeout....");
			service.shutdownNow();
		}

	}

}
