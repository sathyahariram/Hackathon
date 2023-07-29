package Hackathon_20to30;
import java.util.Scanner;
//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.


public class Q25_binarySearch {
	static void sort(int[] size) {
		System.out.print("elements of the array after sorting:  ");
		for(int i=0; i<size.length; i++) {
			for(int j=0; j<size.length-1; j++) {
				if(size[j]>size[j+1]){
					int temp=size[j];
					size[j]=size[j+1];
					size[j+1]=temp;
					}
				
				}
			}	
		for(int p=0; p<size.length; p++) {
			System.out.print(size[p]+" ");
		}
	}
			
	static int findkey(int[] array, int key, int L, int R )
		{
			int mid=(R-L)/2;
			
			
			
			if(array[L+mid]==key) {
				System.out.println("key found in if index:"+ L+mid);
				return L+mid;
			}
			else if(R-L<= 2)
				{
					if(array[L+(mid-1)]==key) {
						System.out.println("key found in elseif index:"+ L+(mid-1));
						return L+(mid-1);
						}
					else {
						return -1;
					}
				}
			
			else if(array[L+mid]<key) {
				L=L+(R-(L+mid));
				System.out.println("else if loop"+L + R);
				return findkey(array,key, L,R);
			}
			else{
				//(array[L+mid]>key)//3
				R=L+mid;
				System.out.println("else loop"+L + R);
				return findkey(array,key, L,R);	
				}
			}
	
	static int binarySearch(int arr[], int l, int r, int x)
	{
	    while (l <= r) {
			System.out.println("while loop"+l + r);
	        int m = l + (r - l) / 2;
	 
	        // Check if x is present at mid
	        if (arr[m] == x)
	            return m;
	 
	        // If x greater, ignore left half
	        if (arr[m] < x)
	            l = m + 1;
	 
	        // If x is smaller, ignore right half
	        else
	            r = m - 1;
	    }	
	    // If we reach here, then element was not present
	    return -1;
	}
	


public static void main(String[] args) {
	Scanner array= new Scanner(System.in);
	System.out.print("Enter the size of the array:  ");
	int array1=array.nextInt();
	int size[]=new int[array1];
	
	System.out.print("Enter the elements of the array:  ");
		for(int i=0; i<array1; i++) {
			size[i]=array.nextInt();
		}
		sort(size);
		System.out.print("Enter the key value to be searched: ");
		int key=array.nextInt();
		
		//int size[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		//findkey(size, 7,0, size.length);
		System.out.println("my key is found in"+findkey(size, key,0, size.length));
		//System.out.println("while key is found in"+binarySearch(size,0, size.length, 2));
	}
	
}
