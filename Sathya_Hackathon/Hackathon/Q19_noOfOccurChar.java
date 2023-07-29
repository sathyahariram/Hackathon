package com.Hackathon;
//WJP to display number of occurrence of all character
public class Q19_noOfOccurChar {

	static void get(String word) {
		int count;	
		for(int i=0; i<word.length(); i++) {
			count = 1;
			for(int j=0;j<word.length(); j++) {
			if(i==j)
				continue;
			if(word.charAt(i)==word.charAt(j)) {
				if(j<i) {
					count =0;
					break;
				}
				count++;
			//return(j);
				}
			}
			if(count>=1)
				System.out.println(word.charAt(i)+" is "+ count+"times");
				}
	}

		public static void main(String[] args) {
			String word="aasedfdrrfdasdr";
			get(word);
		}
}
