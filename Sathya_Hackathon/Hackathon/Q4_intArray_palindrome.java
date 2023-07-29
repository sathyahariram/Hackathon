package com.Hackathon;
import java.util.Scanner;
//Given an array of integers check the Palindrome of the series

public class Q4_intArray_palindrome {
	
	static void inpalin(int palindrome) {
		int sum=0;
		int m, d;
		int n=palindrome;
	
		while(n>0) {
			m=n%10;
			sum=(sum*10)+m;
			n=n/10;
		}
			if(sum==palindrome) {
			System.out.println("given array of number is palindrome");
			}
			else
			{
				System.out.println("given array of number is not a palindrome");
			}
		}
	
	

	

	public static void main(String[] args) {
		
		Scanner array = new Scanner(System.in);
		System.out.print("Enter the size of the array:  ");
		int size = array.nextInt();
		int palindrome[]=new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the " + (i+1)+" integer:  ");
			palindrome[i]=array.nextInt();
			
			inpalin(palindrome[i]);
			
		}
		
		
	}

}
