package com.mk.java8.features;

interface A {

	void show();

}

class Xyz implements A {

	@Override
	public void show() {
		System.out.println("Hello");
	}

}

public class LambdaDemo {

	public static void main(String[] args) {
		
		//A obj= new Xyz();
		//obj.show();
		/**
		 * If you check the role of the Class Xyz 
		 * then u will find that its for only for implementing the 
		 * A and using it only once.
		 * Instead of this we can obj of A...??
		 * now q comes we cant create Interface object right so 
		 * 
		 * just  we can provide the implementation there it self as inner class
		 * like below
		 * Here it will create 3 .class files
		 */
		
		/* A obj= new A(){
			
			 public void show() {
				System.out.println("Hello");
			}
			
		};
		obj.show();*/
		
		
		/*
		 * Now instead of wrting all of this 
		 * java has come up with lambda expression that can be 
		 * implemented as
		 */
		A obj;
		obj =() -> {
			System.out.println("Hello");
		};
		obj.show();
		
	}
	}

