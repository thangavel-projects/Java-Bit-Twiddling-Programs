package com.sample.bit.twiddling;

public class SubtractionTwoNumber {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int result = subtraction(a, subtraction(~b, 1));
		System.out.println("The Subtraction value is: " + result);
	}

	private static int subtraction(int x, int y) {
		while (y != 0) {
			int carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		return x;
	}
}
