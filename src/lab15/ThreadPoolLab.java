package lab15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolLab {

	public static void main(String[] args) {
		Counter counter = new Counter();
		int numThreads = 5;

		ExecutorService executor = Executors.newFixedThreadPool(numThreads);

		for (int i = 0; i < numThreads; i++) {
			executor.submit(new Worker(counter));
		}

		executor.shutdown();

		try {
			executor.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("ThreadPool Final count: " + counter.getValue());
	}

}
