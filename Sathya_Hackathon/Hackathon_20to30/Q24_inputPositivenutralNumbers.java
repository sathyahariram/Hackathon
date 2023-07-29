package Hackathon_20to30;

public class Q24_inputPositivenutralNumbers {
	static void printoutput(int i, int j) {
		
		for(;i<=j; i++) {
			System.out.print(i + (i==j?" ":"+"));
		}
		System.out.println();
		}
	

	public static void main(String[] args) {
		// Q24. Write a program which inputs a positive natural number N and prints the possible consecutive number combinations, which when added give N.    	INPUT:  N = 9  	OUTPUT:  4 + 5  		      2 + 3+ 4
		int i,j;
		int input=15;
		
		for(i=1; i<input; i++) {
			int sum=0;
			for(j=i; j<input; j++) {
				sum=sum+j;
				if(sum<input) 
					continue;
				if(sum==input) 
					printoutput(i,j);
				break;	
			}
		}
		
		
		//printoutput(2,8);

	}

}
