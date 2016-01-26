package com.sample.bit.twiddling;

public class FindDuplicatesNumbersInArray {

	public static void main(String[] args) {
		int array [] = {1,2,3,4,5,5,6};
		
		for (int i = 1; i < array.length; i++) {
			array[i] = array[i] ^ array[i-1] ^ i;
		}
		System.out.println(array[array.length - 1]);
	}
}
