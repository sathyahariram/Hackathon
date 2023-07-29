package com.Hackathon;

import java.util.Scanner;
public class Q2_factorial {

	public static void main(String[] args) {
		//write a program to find factorial (Non Recursive)
		
		  int a=1; Scanner factorial=new Scanner(System.in);
		  System.out.print("enter the number to find the Factorial: ");
		 
		int fact=factorial.nextInt();
		for(int i=1; i<=fact; i++) {
			a=a*i;
		}
		System.out.println("Factorial of the given number is: " + a);
		}

}

