package com.mk.threads;

public class TwoThreads implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Printing number \t " + i);
		}

	}

	public static void main(String[] args) throws InterruptedException {
		
		TwoThreads obj= new TwoThreads();
		Thread t1= new Thread(obj);
		t1.start();
		t1.sleep(1800);
		System.out.println("T1 is sleeping"+t1);
		Thread t2= new Thread(obj);
		t2.start();
		t2.setName("ABC");
		System.out.println("current thread is "+t2.getName());

	}
}
