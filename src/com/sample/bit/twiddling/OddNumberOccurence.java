package com.sample.bit.twiddling;

public class OddNumberOccurence {

	public static void main(String[] args) {

		//int [] ar = {3,3,1,1,1,1,2,2,2,3,3,4,4,4,4,5,5,5,5}; // One number occurs odd times and others even times.
		 int [] ar = {1,1,2,3,3,4,4};
	     int res = 0; 
	     for (int i=0; i < ar.length; i++)     
	        res = res ^ ar[i];
	     System.out.println(res);

	}
}
