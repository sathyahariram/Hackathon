package hackathon31to40;

public class Q40_StringImmutable {

	public static void main(String[] args) {
		// Q40. Why string is Immutable?
		//Immutable means unchangeable, unmodifiable
		
		//String in java can be used to access data sources like files, database, and also sometimes username and password will be 
		//stored in string. So for the security reasons its immutable.
		// string constant pool provides the facility to reusability of the existing string object.
		// this will help to speeding up of the application and also saving the memory by pointing the same content for two objects.
		// no garbage collector in string
	String s1="java";// object created in pool
	System.out.println(s1);
	
	 s1=s1+"code";// it will not modify the s1 instead creates another object in pool pointed by same s1
	 System.out.println(s1);
	}

}
