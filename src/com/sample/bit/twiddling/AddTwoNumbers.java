package com.sample.bit.twiddling;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int x  = 2, y = 5;
		while (y != 0)
	    {
	        int carry = x & y;  
	        x = x ^ y; 
	        y = carry << 1;
	    }
		System.out.println("The sum of the two number is :"+ x);
	}
}
