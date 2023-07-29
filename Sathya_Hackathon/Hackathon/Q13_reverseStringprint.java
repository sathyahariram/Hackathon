package com.Hackathon;

public class Q13_reverseStringprint {

	public static void main(String[] args) {
		// Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)
		String rev="Java Code";
		//String[] word=rev.split(" ");
		//String reversedString="";
		//for(String w:word) {
			//System.out.println(w);
			String reverseword="";
			for(int i=rev.length()-1; i>=0; i--) {
				
				reverseword=reverseword+rev.charAt(i);
			}
			//reversedString = reversedString+reverseword+ " ";
			System.out.println(reverseword);
		}
		
	}


/*String input="java code";
String word[]=input.split("//s");
String reversedstring="";
for(String w:word) {
	String reverseword="";
	StringBuffer sb=new StringBuffer(w);
	sb.reverse();
	reverseword=reverseword+sb;
	reversedstring = reversedstring+reverseword+ " ";
}
System.out.println(reversedstring);

}*/
