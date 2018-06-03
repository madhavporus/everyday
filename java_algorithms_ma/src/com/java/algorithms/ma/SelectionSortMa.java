package com.java.algorithms.ma;
public class SelectionSortMa {
	public static void main(String[] args) {
		//selectionSortBy2ForLoops();  // Calling the 'selectionSort()' function.
		selectionSortbyWhileLoop();
	}
	
	
	public static void selectionSortbyWhileLoop() {
		int arr[] = {9,2,1,0};
		int minindex;
		int min;
		int tmp;
		for(int i=0;i<arr.length;i++) {
			min= arr[i];
			minindex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < min) {
					min = arr[j];
					minindex =j;
				}
			}
			tmp = arr[minindex];
			arr[minindex] = arr[i];
			arr[i] = tmp;
		}
	
		for(int k =0; k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}
}
