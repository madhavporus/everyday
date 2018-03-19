package com.y18.mar5.x_java_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumObtimized {
	
	public static List<Integer> findDuplicates(int[] arr){
		Set<Integer> resultSet = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			int index = Math.abs(arr[i]-1);
			if(arr[index]<0) {
				resultSet.add(Math.abs(arr[i]));
			}else {
				arr[index] = -arr[index];
			}
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=Math.abs(arr[i]);
		}
		
		return new ArrayList(resultSet);
		
	}
 	
	public static void main(String args[]) {
		int[] arrx= {2,1,2,1,2,3,4};
		ArrayList<Integer> arx = new ArrayList<Integer>();
		findDuplicates(arrx);
		arx.addAll(findDuplicates(arrx));
		
		for(int y:arx) {
			System.out.println(y);
		}
	 
	
		
	}
	
}
