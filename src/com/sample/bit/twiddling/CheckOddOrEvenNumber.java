package com.sample.bit.twiddling;

public class CheckOddOrEvenNumber {
	
	public static void main(String[] args) {
		int x = 13, result;
		result = x & 1;
		System.out.println(result != 0 ? "Odd Number" : "Even Number");
	}
}
