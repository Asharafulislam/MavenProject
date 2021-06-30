package com.asharaful;

public class Exercise3 {

	public static void main(String[] args) {
		int num = 10, count = 1, total = 0;

		while (count <= num) {
			total = total + count;
			count++;
		}

		System.out.println("The sum of the first 10 nature number is: " + total);
	}

}
