package com.mk.threads;

public class ThreadYeild extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++)
			System.out.println(Thread.currentThread().getName() + " in control");
	}

	public static void main(String[] args) {

		ThreadYeild ob1 = new ThreadYeild();
		ob1.start();
		ThreadYeild ob2 = new ThreadYeild();
		ob2.start();

		for (int i = 0; i < 3; i++) {
			ob2.yield();
			System.out.println("Yeild called");
			System.out.println(Thread.currentThread().getName() + " in control");

		}

	}

}
