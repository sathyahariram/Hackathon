package com.Hackathon;

import java.util.Scanner;
public class Q16_removeCharfromString {
	public static void result(String que) {
	Scanner remove=new Scanner(System.in);
	System.out.print("Enter the char to be removed: ");
	Character removechar = remove.next().charAt(0);
	StringBuilder stringre = new StringBuilder(que);
	//String strNew = que.replace("a", " ");
	//System.out.print(strNew);
	for(int i=0; i<que.length(); i++) {
//		System.out.println(que.charAt(i));
		if(removechar.equals(que.charAt(i))) {
//			System.out.println("The charater is equal at" + i);
	        stringre.setCharAt(i, ' ');
		}
	}
	System.out.println("The modified string is: " + stringre);
	}
	
	public static void main(String[] args) {
		// Write a method that will remove given character from the String?
		String que="Java Code";
		System.out.println("The Original string is: " + que);
		result(que);

	}

}
