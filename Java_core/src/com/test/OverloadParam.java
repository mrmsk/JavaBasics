package com.test;
/*
 * in the below example compiler alwyas give prio to the primitives over object
 * if the we paas one with int and another with String it will give
 * ambibuity as both of these on the same level.
 */
public class OverloadParam {
	//http://geekexplains.blogspot.com/2009/06/choosing-most-specific-method-tricky.html

	/*
	 * public void write(Integer i) { System.out.println("Printing Integer" + i); }
	 */

	public void write(Object obj) {
		System.out.println("Printing Object \t" + obj);
	}

	public void write(String obj) {
		System.out.println("Printing  String  \t" + obj);
	}

	public static void main(String[] args) {

		OverloadParam objref = new OverloadParam();
		objref.write("test");
		objref.write(null);
	}

}
