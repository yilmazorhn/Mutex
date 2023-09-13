package org.example;

public class Worker implements Runnable {

	private final SharedResource sharedResource;

	public Worker(SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}
	@Override
	public void run() {
		sharedResource.doWork();
	}
}
