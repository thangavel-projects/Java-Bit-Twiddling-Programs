package com.sample.bit.twiddling;

public class CheckPowerOfTwo {

	public static void main(String[] args) {
		
		boolean powerOfTwo = isPowerOf2(9);
		System.out.println( powerOfTwo == true ? "The given number is power of two" : "The given number is not a power of two");
	}
	
	private static boolean isPowerOf2(int x) {
	    return x > 0 && (x & (x - 1)) == 0;
	}
}
