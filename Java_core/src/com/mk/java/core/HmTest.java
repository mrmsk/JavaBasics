package com.mk.java.core;

import java.util.HashMap;
import java.util.Set;

public class HmTest {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> map= new HashMap<Integer,String>(); 
		map.put(1, "Mandar");
		map.put(2,"Rohit");
	
		Set myset=map.entrySet();
		
		for(Integer key:map.keySet()) {
			System.out.println("key is :"+key+"\n"+"Value is "+map.get(key) );
		}
	}

}
