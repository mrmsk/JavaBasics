package com.test;

public class OverloadParam {
	
	
	/*
	 * public void write(String str) { System.out.println("Printing String  "+str);
	 * 
	 * }
	 * 
	 * public void write(Integer i) { System.out.println("Printing Integer"+ i);
	 * 
	 * } public void write(Float f) { System.out.println("Printing Float"+ f);
	 * 
	 * } public void write(Object obj) { System.out.println("Printing Object"+ obj);
	 * 
	 * 
	 */
	
	public void write(Integer i) { System.out.println("Printing Integer"+ i);}

	public void write(Object obj) { System.out.println("Printing Object"+ obj);}
	
	

	public static void main(String[] args) {
		
		OverloadParam objref= new OverloadParam();
		objref.write(null);
	}

}
