package com.sample.bit.twiddling;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		int a = 12, b = 2, result = 0;
		while (b != 0) {
			if ((b & 1) != 0) {
				result = result + a;
			}
			a <<= 1;
			b >>= 1;
		}
		System.out.println("The Multiplied value is: "+result);
	}
}
