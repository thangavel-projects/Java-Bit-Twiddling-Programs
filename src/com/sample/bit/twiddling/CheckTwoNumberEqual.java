package com.sample.bit.twiddling;

/**
 * Check two number are equal without using == operator
 * @author Thangavel
 */

public class CheckTwoNumberEqual {
	
	public static void main(String[] args) {
		int x = 10, y = 10;
		int result = x ^ y;
		System.out.println(result == 0 ? "Both are Equal" : "Both are not equal");
	}
}
