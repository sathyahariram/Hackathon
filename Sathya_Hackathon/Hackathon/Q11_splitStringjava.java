package com.Hackathon;

public class Q11_splitStringjava {

	public static void main(String[] args) {
		// How to Split String in java?
		// we can split the string using String[] split(string) method
		
		String spl="How to Split String in java";
		String[] result=spl.split("\\s");
		for(int i=0; i<result.length; i++)
		System.out.println(result[i]);
			

	}

}
