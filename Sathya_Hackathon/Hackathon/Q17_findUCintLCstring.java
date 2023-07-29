package com.Hackathon;
import java.util.Scanner;
//WJP to find total number of integers, uppercase and lowercase character in the give string
public class Q17_findUCintLCstring {
 
	
	static void findcase(String input){
	int num=0;
	int special=0;
	int upper=0;
	int lower=0;
		 for(int i=0; i<input.length(); i++) {	
			if(Character.isUpperCase(input.charAt(i))) {
				upper++;
			}
			else if(Character.isLowerCase(input.charAt(i))){
				lower++;
			}
			else if(input.charAt(i)>='0'&& input.charAt(i)<='9'){
				num++;
			}
			else
				special++;
				
		}
		 System.out.println("The total number of upper cases: "+ upper);
		 System.out.println("The total number of lower cases: "+ lower); 
		 System.out.println("The total number of number: "+ num);
		 System.out.println("The total number of special cases: "+ special);
	}


public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the line tofind UC<LC");
	String input=sc.nextLine();
	findcase(input);
}
}


