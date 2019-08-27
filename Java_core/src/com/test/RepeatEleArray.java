package com.test;

import sun.security.util.Length;

public class RepeatEleArray {

	public static void main(String[] args) {
		
		
		int myarry[]= {1,1,1,11,1,11,1,1,1,23,4,6,7,6,7,98,78,98};
		
		
		for(int i=0;i<myarry.length;i++) {
			for(int j=i+1;j<myarry.length;j++) {
				if(myarry[i]==myarry[j]) {
					System.out.println(myarry[i]);
					break;
				}
				
			}
			
		}
		
	}

}
