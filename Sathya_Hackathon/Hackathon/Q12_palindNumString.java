package com.Hackathon;

public class Q12_palindNumString {

	public static void main(String[] args) {
		// Write a program to check palindrome (MalayalaM) for both numbers and string?
		String rev="121";
		String[] word=rev.split(" ");
		String reversedString=" ";
		for(String w:word) {
			String reverseword=" ";
			for(int i=w.length()-1; i>=0; i--) {
				reverseword=reverseword+w.charAt(i);
			}
			reversedString = reversedString+reverseword+ " ";
		}
		if(rev.equals(reversedString)) {
		System.out.println(reversedString + "is a Palindrome");
		}
		else
			System.out.println(reversedString + "is not a Palindrome");
	}

		

	}


