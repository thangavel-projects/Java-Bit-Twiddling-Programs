package com.sample.bit.twiddling;

public class FindMaxNumber {

	public static void main(String[] args) {
		int a = 192, b = 162;
		int z = subtraction( a, subtraction( ~b, 1 ) );
		int i  = (z  >>  31)  &  0x1;
		int result = multiply( z , i ) ;
		int max = subtraction( a, subtraction( ~result, 1) );
		System.out.println("The Max number is: "+max);
	}
	
	private static int subtraction( int x, int y ) {
		while (y != 0) {
			int carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		return x;
	}
	
	private static int multiply( int a , int b ){
		int result = 0;
		while (b != 0) {
			if ((b & 1) != 0) {
				result = result + a;
			}
			a <<= 1;
			b >>= 1;
		}
		return result;
	}
}
