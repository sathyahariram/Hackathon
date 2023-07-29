package com.Hackathon;

public class Insersion_sort {

	public static void main(String[] args) {
		// Insertion sort

		int array[]= {9,3,1,8,5,6};
		int i=1 ,j=0;
		int key=array[i];
		int temp;
		for(array[j]=array.length-1; key<array[j-1]; j++) {
			for(array[i]=array.length-1; key<array[i-1]; i++) {
			temp=array[i-1];
			array[i-1]=key;
			key=temp;
		
		if(i<array.length) { 
			System.out.print("Insertion sorted array is: "+ array[i]);
		}
		}
	}
}
}


