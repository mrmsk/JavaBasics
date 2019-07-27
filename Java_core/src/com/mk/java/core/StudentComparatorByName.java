package com.mk.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentComparatorByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

	public static void main(String[] args) {

		Student s1 = new Student("Mandar", 2, 30);
		Student s2 = new Student("abc", 3, 45);
		Student s3 = new Student("zty", 4, 12);

		ArrayList<Student> st = new ArrayList<Student>();
		st.add(s1);
		st.add(s2);
		st.add(s3);

		Collections.sort(st, new StudentComparatorByName());

		Iterator<Student> itr = st.iterator();
		while (itr.hasNext()) {
			Student object = (Student) itr.next();
			System.out.println(object.getName()+"\t" + object.getAge()+"\t" + object.getEmpNo());

		}

	}
}
