package com.java.algorithms.ma;

public class InsertionSort {

	public static void main(String args[]) {
		
		insertionSOrt();
		
		
		
	}

	private static void insertionSOrt() {
		int[] arr = {999,9,7,4,2,0,};
		int key;
		
		for(int i=1;i<arr.length;i++) {
			key = arr[i];
			while( i > 0 && arr[i-1] > key) {
				arr[i] = arr[i-1];
				i--;
			}
			arr[i]=key;
		}
		for(int y:arr) {
			System.out.println(y);
		}
		
	}
	
	
}
