package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapCustomKeyExample {

	
	
	public static void main(String[] args) {

		HashMap<Book, String>mycustmap=new HashMap<Book, String>();
		mycustmap.put(new Book("Java", "author1"), "Java");
		mycustmap.put(new Book("C", "author2"), "C");
		mycustmap.put(new Book("Java123", "author123"), "Java123");

		mycustmap.forEach((k,v) ->System.out.println(k+"==>"+v+"values is "+v));
		
		
	}

}
