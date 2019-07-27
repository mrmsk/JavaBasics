package com.mk.java.core;

public class Student {

	private String name;
	private int empNo;
	private int age;

	public Student(String nm, Integer eno, Integer age) {

		this.age = age;
		this.empNo = eno;
		this.name = nm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
