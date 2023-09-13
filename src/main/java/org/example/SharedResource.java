package org.example;

public class SharedResource {

	public void doWork() {
		// Use synchronized block to create a mutex
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " is performing work.");
			try {
				Thread.sleep(2000); // Simulate some work
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println(Thread.currentThread().getName() + " has finished work.");
		}
	}
}
