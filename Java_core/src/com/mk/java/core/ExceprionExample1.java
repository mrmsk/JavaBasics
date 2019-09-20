package com.mk.java.core;

public class ExceprionExample1 {

	public static void main(String[] args) throws NullPointerException {
		
		try {
			
			int a=0,b=2,c;
			c=a+b;
			
		}catch(Exception e) {
			
		}
		
		finally {
			System.out.println("final block");
		}
	}

}
