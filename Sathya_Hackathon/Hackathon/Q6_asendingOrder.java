package com.Hackathon;
//WJP to perform ascending order Selection  sort

import java.util.Scanner;

public class Q6_asendingOrder {

		// 6.WJP to perform ascending order Selection sort
		static void sortprint(int[] printarray) {
			for(int i=0; i<printarray.length; i++) {
				System.out.print(" "+ printarray[i]);
				}
			System.out.println();
			}
		static void bubble(int[] size) {
			int n=size.length;
			int temp;

			System.out.println("Array before sorting is");	
			sortprint(size);
			for(int i=0; i<n; i++) {
				for(int j=0; j<n-1; j++) {
					
					if(size[j]>size[j+1]) {
						temp=size[j];
						size[j]=size[j+1];
						size[j+1]=temp;
						}
					}
				}
			System.out.println("Array After sorting is");
			sortprint(size);
			}
		public static void main(String[] args) {
			Scanner array = new Scanner(System.in);
			System.out.print("Enter the size of the array:  ");
			int array1 = array.nextInt();
			int size[]=new int[array1];
			
			for(int i=0; i<array1; i++) {
				size[i]=array.nextInt();
				
			}
			bubble (size);	//bubble(a);
				array.close();
		
		}
}
