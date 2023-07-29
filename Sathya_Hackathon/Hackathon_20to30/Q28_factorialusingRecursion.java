package Hackathon_20to30;
//Q28. WJP to find factorial of a number using recursion
import java.util.Scanner;

public class Q28_factorialusingRecursion {
	
	static int fact(int n)
	{
		if(n==1)
			return n;
		return (n* fact(n-1));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial:");
		int n=sc.nextInt();
		
		System.out.println(" factorial of the given number is:"+ fact(n));
	
	sc.close();
	}

}
