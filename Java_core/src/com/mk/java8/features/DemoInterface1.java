package com.mk.java8.features;

/**
 * 
 * @author Admin
 *This is a secnerio where u have published u r interface to out side the world with
 *call as feature and some AndroidPhone1 co is implementing u r interface and calling the call 
 *method.
 * 2 no::: lets assume u r implementing new api and now u have added the new fetaure 
 * as message, so in this case the classes which are implementing this interface also
 * needs to override this method right?
 * so in java 8 onwards we can define the logic here itslef and for that we need to add
 *  a method with default keyword i.e default void message().
 *  
 *  Java 8 introduces the “Default Method” or (Defender methods) feature, which allows the developer 
 *  to add new methods to the interfaces without breaking their existing implementation
 * 
 *
 */
interface Phone1{
	
	void call();
	default void message() {
		System.out.println("I m message from Phone1 Interface");
	}
}

class AndroidPhone1 implements Phone1{

	@Override
	public void call() {
		System.out.println("calling from android phone");
		
	}
	
}

public class DemoInterface1 {


	
	 public static void main(String[] args) {
		 Phone1 p1 = new AndroidPhone1();
		 p1.call();
		 p1.message();
	}
}
