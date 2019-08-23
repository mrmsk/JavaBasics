package com.mk.threads;

public class ThreadwithInterface implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing numbers" + i);
		}

	}

	public static void main(String[] args) throws InterruptedException {
		ThreadwithInterface obj = new ThreadwithInterface();
		Thread T1 = new Thread(obj);
		T1.start();

	}

}
