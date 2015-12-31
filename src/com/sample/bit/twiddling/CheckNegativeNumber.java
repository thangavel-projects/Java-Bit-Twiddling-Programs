package com.sample.bit.twiddling;

public class CheckNegativeNumber {
	
	public static void main(String[] args) {
		int x = 10, result;
		result = x >> 31;
		System.out.println(result != 0 ? "Negative Number" : "Not a Negative Number");
	}

}
