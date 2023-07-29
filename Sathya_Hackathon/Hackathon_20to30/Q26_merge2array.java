package Hackathon_20to30;

import java.util.Arrays;

public class Q26_merge2array {

	
		// Q26. WJP to merge two sorted array.(Do not use third array)		array1[10] = 1,2,4,6,9,10		array2[4] =  3, 5,7,8		After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10
	static void merge_a1b1(int a[], int b[]){
		int index=0;
		int ind=a.length-b.length;
		
		
		for (int item: b) {
			
			  a[ind++] = item;
		}
		System.out.println(Arrays.toString(a));
		 
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				
				if(a[j]>a[j+1]) {//25>32
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		  for(int r=0; r<a.length; r++){
			  System.out.print(a[r]+" ");
		  }
	}
	public static void main(String[] args) {
		
		int a1[]= {1,2,4,6,9,10,0,0,0,0}; //{25,32,45,90,0,0,0,0,0,0};
		int b1[]= {3, 5,7,8};
		
		merge_a1b1(a1,b1);
		}

	

	}


