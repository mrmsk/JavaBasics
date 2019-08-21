package com.test;

public final class ImmutableStudent {
	
	private final String studentId;
	private final String name;
	private final Address address;
	
	
	public ImmutableStudent(String studentId, String name, Address address) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
	}


	public String getStudentId() {
		return studentId;
	}


	public String getName() {
		return name;
	}


	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();
	}
	
	
	
	
	
	
	

}
