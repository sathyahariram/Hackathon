package com.Hackathon;
//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.

public class Q5_duplicateNum {
	
	static void duplic(int[] numbers) {
		int len=numbers.length;
		int duplicate;
		int dupcount=0;
		for(int i=0; i<len; i++) {
			duplicate=0;
			for(int j=0; j<len; j++) {
				if(i==j)
					continue;
				if(numbers[i]==numbers[j]) {
					duplicate=1;
					//System.out.println(numbers[i] + "is a Duplicate number ");
					break;
					}
			}
			if(duplicate==0)
				System.out.println(numbers[i] + "  is a Unique number ");
			else {
				
				dupcount++;
			}
			}
		System.out.println(dupcount + " number of duplicate entries ");
		}
	
	public static void main(String[] args) {
		//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
	
	int a[]= {5,10,22,22,10,13,9};
	duplic(a);
	}}
	//System.out.println(numbers[j] + "is a Unique number ");
	

