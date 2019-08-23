package com.mk.threads;

public class SimpleThread extends Thread {
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("Value of I is"+i);
			
			
		}
	}

	

	public static void main(String[] args) {
		SimpleThread st= new SimpleThread();
		st.setName("mandar thread");
		System.out.println(st.getName());
		st.start();

	}

}
