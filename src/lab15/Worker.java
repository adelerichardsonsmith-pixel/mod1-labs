package lab15;

public class Worker implements Runnable {
	private final Counter counter;
	
	public Worker(Counter counter) {
		this.counter = counter;
	}
	
	@Override
    public void run() {
        for (int i = 0; i < 10000; i++) { // Loop 10,000 times calling increment()[cite: 1]
            counter.increment();
        }
    }
}
