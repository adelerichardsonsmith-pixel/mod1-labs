package lab15;


import java.util.ArrayList;
import java.util.List;

public class ThreadingLab {
	public static void main(String[] args) {
        Counter counter = new Counter();
        List<Thread> threads = new ArrayList<>();
        int numThreads = 5;

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(new Worker(counter));
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Expected count: " + (numThreads * 10000));
        System.out.println("Actual count:   " + counter.getValue());
    }
}
