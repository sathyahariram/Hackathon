package com.Hackathon;
//WJP to display duplicate character in string
import java.util.Scanner;

public class Q18_dupCharString {
	static void findcase(String input){
		int dup=0;
		int uni=0;
		for(int j=0; j<input.length(); j++) {
			for(int i=j+1; i<input.length(); i++) {	
			if((input.charAt(j))==(input.charAt(i))) {
				dup++;
			
			}
			else
				uni++;
	}
		
		}
		System.out.println("number of duplicate char: "+dup);
		System.out.println("number of unique char: "+uni);
		}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the line tofind UC<LC");
		String input=sc.nextLine();
		findcase(input);
		sc.close();
	}

}
