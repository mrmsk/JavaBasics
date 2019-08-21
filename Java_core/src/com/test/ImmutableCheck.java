package com.test;

public class ImmutableCheck {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address= new Address("streetName", "city", "1234");
		ImmutableStudent stu= new ImmutableStudent("1", "Mandar", address);
		
		
		Address s1= stu.getAddress();
		System.out.println("Orignal address"+s1);
		s1.setCity("pune");
		System.out.println(stu.getAddress());
		s1.setPinCode("zzzzz");
		System.out.println(stu.getAddress());

		
		

	}
}
