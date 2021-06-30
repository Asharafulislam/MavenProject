package com.asharaful;

public class Exercise2 {

	public static void main(String[] args) {

		int age = 0;

		outer: while (age < 21) {
			age++;
			if (age == 16) {
				System.out.println("Pleasae get your driver's license");

				continue outer;

			} else {
				System.out.println("Please wait another Year");
			}
		}

	}

}
