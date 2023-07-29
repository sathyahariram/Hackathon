package stringAssignments;
//Check the given word is present in a give String . String S = "I am learning qa automation testing" word ="qa".

import java.util.Scanner;
public class Q2_removeWordString {
	
	//public class Q16_removeCharfromString {
		public static void result(String que) {
		Scanner remove=new Scanner(System.in);
		System.out.print("Enter the word to be removed: ");
		String removechar = remove.nextLine();
		StringBuilder stringre = new StringBuilder(que);

	//	for(int i=0; i<que.length(); i++) {

			if(removechar.equals(que.replaceAll(que, removechar))){

		        stringre.toString();
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
