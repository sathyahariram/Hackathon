package hackathon31to40;
//Q39. What is method overloading and Method over riding?

//Method Overloading: 

/*
 * when a class having more than one method with the same method name with
 * different parameters it is overloading
 * 
 * when a subclass has same method as parent class it overrides the parent class
 * is called overriding.
 * 
 */

public class Q39_method_overL_overR {
	
	static void mul(int a, int b){
		System.out.println("multiplication of a*b is:" + a*b);
	}
	
	 static void mul(int a, int b, int c){
	 System.out.println("multiplication of a*b*c is:" + a*b*c); }
	

	public static void main(String[] args) {
		
		mul(4,3);
		mul(4,2,3);		
		
	}

}
