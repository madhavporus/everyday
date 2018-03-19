// Split an array and add first half to an ArrayList and second half to another Array List
package com.y18.mar5.x_java_practice;

import java.util.ArrayList;

public class SlpitArrayInToTwoDifferentArrayList {
	
	public static void findDupOptimize() {
		int outer,inner,midOfMainArray;
		int[] mainArray = {89,89,32,0,1,2,32,12,12};
		ArrayList<Integer> secArray = new ArrayList<>();
		ArrayList<Integer> ThrArray = new ArrayList<>();
		System.out.println("The length of the main array is: "+ mainArray.length);
		 
		midOfMainArray = mainArray.length/2;
		System.out.println("The mid number is: "+ midOfMainArray);
		
		for(int i=0;i<midOfMainArray;i++) {
			secArray.add(mainArray[i]);
		}
		for(int j=midOfMainArray;j<=mainArray.length-1;j++) {
			ThrArray.add(mainArray[j]);
		}
		
		
		
		
		for(int y:secArray) {
			System.out.println("The Second array numbers** : "+ y);
		}
		System.out.println("--------------------------------");
		for(int z:ThrArray) {
			System.out.println("The Third array numbers++ : "+ z);
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDupOptimize();
	}

}
