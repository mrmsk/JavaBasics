package com.mk.java.core;

public class StringIntern {

	public static void main(String[] args) {
		String name="mandar";
		String n1= new String("mandar").intern();
		System.out.println(name==n1);
		
		

	}

}
