package hackathon31to40;

public class Q34 {
	static void arithmatic(int a,int b) {
	
		//Addition
		int add=a+b;
		System.out.println("The addition of two Numbers is: "+add);
		
		//Multiplication
		int mul=0;
		for(int i = 1; i<=b; i++) {
			mul=mul+a;
			}
		System.out.println("The Multiplication of two Numbers is: "+mul);
		
		//Subtraction 
		int sub=0;
		if(a>b) {
			for(int i=0;b<a; b++) {
				sub=sub+1;
			}
			System.out.println("The subtraction of two Numbers is: "+sub);
		}
		else{
			for(int i=0;a<b; a++) {
				sub=sub+1;
			}
			System.out.println("The subtraction of two Numbers is: "+sub);
		}
		// Division
		
		int div=0;
		if(a>=b) {
		for(int i=0;b<a; b++) {
			b=b+b;
			div=div+1;
			System.out.println("The division of two Numbers is: "+ div);
			}
		}
	}
		
		
	
	

	public static void main(String[] args) {
		// Q34. Write a method to implement *, - , / operations. You should use only the + operator
		arithmatic(30,10);
			

	}

}
