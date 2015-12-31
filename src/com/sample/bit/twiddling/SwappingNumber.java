package com.sample.bit.twiddling;

/**
 * Swap the two numbers without using temp variable 
 * @author Thangavel
 *
 */
public class SwappingNumber {

	public static void main(String[] args) {
		int x = 4, y = 8;
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("The X value :"+x + "\nThe Y value :"+y);
	}
}
