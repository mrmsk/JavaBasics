package com.test;

public class SumofNo {

	public static void main(String[] args) {

		int no = 1234;
		int tmp = 0, sum = 0;

		while (no > 0) {
			tmp = no % 10;
			sum = sum + tmp;
			no = no / 10;
			System.out.println(sum);

		}

	}

}
