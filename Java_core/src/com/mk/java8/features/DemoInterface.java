package com.mk.java8.features;

/**
 * 
 * @author Admin
 *This is a normal secerio where we need to implement the interface methods.
 *as below
 */
interface Phone{
	
	void call();
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
		System.out.println("calling from android phone");
		
	}
	
}

public class DemoInterface {


	
	 public static void main(String[] args) {
		 Phone p = new AndroidPhone();
		 p.call();
		
	}
}
