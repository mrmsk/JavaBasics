package com.mk.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Admin
 *	For Each Method
 *  Internal loops ... in java 8 
 */
public class DemoForEach {

	public static void main(String[] args) {
		
		List<Integer>numbersList= Arrays.asList(1,2,3,4,5,6,7);
		numbersList.forEach(i ->System.out.println(i));
	}

}
