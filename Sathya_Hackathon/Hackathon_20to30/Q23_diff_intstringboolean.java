package Hackathon_20to30;
import java.util.Scanner;
public class Q23_diff_intstringboolean {
	static void finddatatyppe() {
	Scanner input=new Scanner(System.in); {
		System.out.println("Enter the Input");
		if(input.hasNextInt()) {
			System.out.println("This is an integer");
		}
		else if(input.hasNextBoolean())
		{
			System.out.println("This is a Boolean Type");
		}
		else if(input.hasNextLine())
		{
			System.out.println("This is a String Type");
		}
		
	}
	}
	

	public static void main(String[] args) {
		// Q23. WJP to differentiate input as string, int or bool
		finddatatyppe();
	}
}
