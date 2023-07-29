package com.Hackathon;

public class Q14_reverseWordString {
//Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)
	public static void main(String[] args) {
	String rev="Java Code hariram";
	String[] word=rev.split(" ");
	String reversedword= "";
	System.out.println(word.length);
	for(int i=word.length -1; i>=0; i--) {
		if(i==0) {
			reversedword=reversedword+word[i];
		}
		else {
			reversedword=reversedword+word[i]+" ";	
			
		}
	}
	System.out.println(reversedword);
	}
}
	
