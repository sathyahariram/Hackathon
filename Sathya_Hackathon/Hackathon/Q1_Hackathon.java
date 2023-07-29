package com.Hackathon;

import java.util.Scanner;

public class Q1_Hackathon {

	public static void main(String[] args) {
		
		
		
		//Q1.	Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true    
		
		Scanner inp=new Scanner(System.in);
		System.out.print("enter the 1st boolean value : ");
		boolean a=inp.nextBoolean();
		System.out.print("enter the 2nd boolean value : ");
		boolean b=inp.nextBoolean();
		System.out.print("enter the 3rd boolean value : ");
		 boolean c=inp.nextBoolean();
		
		 if((a&&b||a&&c)||(b&&c))//&& if both true it will fo inside loop || is for either one of it is true loop will run
		 {
			 System.out.println("two variables are true");
		 }
		  else
		  {
			  System.out.println("two variables are not true");
		  }
		inp.close();
	}
}
		