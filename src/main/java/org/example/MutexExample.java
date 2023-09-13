package org.example;

public class MutexExample {
	public static void main(String[] args) {
		SharedResource resource = new SharedResource();

		Thread thread1 = new Thread(new Worker(resource));
		Thread thread2 = new Thread(new Worker(resource));

		thread1.start();
		thread2.start();
	}
}