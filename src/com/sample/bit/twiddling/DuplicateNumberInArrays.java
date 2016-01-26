package com.sample.bit.twiddling;

public class DuplicateNumberInArrays {

	public static void main(String[] args) {
		
		int [] a = {0,1,2,3,4,4,6,7,8,9};
		int value = searchWithXOR(a);
	    	System.out.println("The Duplicate in Array is :"+value);
	}
	
	public static int searchWithXOR(int[] array) {
		int dup = 0;
		int offset = 1;
		for(int i = 0; i < array.length; i++) {
			dup = dup ^ (array[i] + offset) ^ i;
		}
		return dup - offset;
	}

}
