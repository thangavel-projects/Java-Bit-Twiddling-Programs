package com.sample.bit.twiddling;

public class FindNonDuplicateNumberInArray {

	public static void main(String[] args) {
		int array [] = {2, 3, 7, 9, 11, 2, 3, 11};
		int result = array[0];
		for (int i = 1; i < array.length; i++){
			result ^= array[i];
		}
		 System.out.println("The Non-duplicate Number is: "+result);
	}
}
