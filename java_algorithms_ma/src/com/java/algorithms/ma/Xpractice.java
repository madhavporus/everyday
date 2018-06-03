package com.java.algorithms.ma;

public class Xpractice {
	
	
	public static void main(String args[]) {
		//selectionSort();
		insertionSort();
		
		//insertionSortC();
		//insertionSortCC();
		//insertionSortMineCopied();
	}
	
	
	
	public static void insertionSort() {
		
		int[] A = {10,23,8,1,36};
		
		for(int i=1;i<A.length;i++) {
			int key = A[i];
			while( i > 0 && A[i-1] > key) {
				A[i]=A[i-1];  
				i--;
			}
			A[i]=key;
			
		}
		for( int x:A) {
			System.out.println(x);
		}
		
	}
	
//---------------------------------------------------	
	  public static void insertionSortCC() {
		  int[] unsorted = {10,9,0,3};
		    for (int i = 1; i < unsorted.length; i++) {
		      int current = unsorted[i];
		      int j = i;
		      // create right place by moving elements
		      while (j > 0 && unsorted[j - 1] > current) {
		        // move
		        unsorted[j] = unsorted[j - 1];
		        j--;
		      }
		      // found the right place, insert now
		      unsorted[j] = current;
		    }
		    for(int i=0;i<unsorted.length;i++) {
				System.out.println(unsorted[i]);
			}
		  }
	

//---------------------------------------------------	
	public static void selectionSort() {
		int a[] = {10,5,9,4,8,3,1,7,11,2,6,0};
		int tmp;
		Boolean flag = true;
		
		while(flag == true) {
			flag = false;
			for (int i=0;i<a.length-1;i++) {
				if(a[i]>a[i+1]) {
					tmp = a[i];
					a[i]=a[i+1];
					a[i+1]=tmp;
					flag = true;
				}
				
			}
						
		}
		
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		
	}
//---------------------------------------------------
	
} // Class Ends here
		
