package com.mk.java.core;

import java.util.HashMap;

import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

public class HashMapTest {

	public void insert1(HashMap<Integer, String> map1) {

		System.out.println(map1.size());
	}

	public void insert2(HashMap<Integer, String> map2) {

		
		System.out.println(map2.size());

	}

	public void insert3(HashMap<Integer, String> map3) {

		
		System.out.println(map3.size());

	}

	public static void main(String[] args) {

		HashMapTest tmp = new HashMapTest();
		HashMap<Integer, String> myhmap = new HashMap<Integer, String>();
		myhmap.put(1, "1");
		myhmap.put(2, "2");
		myhmap.put(3, "3");
		tmp.insert1(myhmap);
		HashMap<Integer, String> myhmap1 = new HashMap<Integer, String>();
		myhmap1.put(1, "1");
		myhmap1.put(2, "2");
		myhmap1.put(3, "3");
		tmp.insert2(myhmap1);
		HashMap<Integer, String> myhmap2 = new HashMap<Integer, String>(1);
		myhmap2.put(4, "4");
		myhmap2.put(5, "5");

		tmp.insert3(myhmap2);
	}

}
