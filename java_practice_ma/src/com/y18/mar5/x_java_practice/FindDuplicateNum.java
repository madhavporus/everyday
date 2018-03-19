package com.y18.mar5.x_java_practice;
import java.util.*;
import java.util.ArrayList;
// FINDING DUPLICATE NUMBERS AND PRINTING THE NUMBERS WHICH ARE REPEATED MORE THAN ONCE.
public class FindDuplicateNum {
	public static void findDup() {
		int i,o;
		int[] ar = {2,2,5,3,3,6,1,1,5,9,9};  // GIVE ARRAY WITH DUPLICATE NUMBERS
		ArrayList<Integer> al = new ArrayList<>(); // ARRAY LIST TO ADD THE NUMBERS WHICH ARE IN DUPLICATE!
		System.out.println("Array length: "+ar.length);
		
		for(o=0;o<ar.length;o++) {  // OUT LOOP, PICKS EACH ITEN OF ARRAY,FROM LEFT TO RIGHT
			for(i=ar.length-1;i>=0;i--) { // INNER LOOP, PICKS EACH ITEN OF ARRAY, FROM RIGHT TO LEFT.
				if (o != i) {  // THIS CHECK IS TO SKIP NUMBER BEING COMPARED WITH IT SELF! 
					if(ar[o]==ar[i]) {
						if(!al.contains(ar[o])) { // SKIP IF THE NUMBER IS ALREADY ADDED TO ARRAYLIST.
							al.add(ar[o]); // ADDING THE REPEATED NUMBER ONLY ONCE, TO GET ONE NUMBER FOR EACH DUPICATED SET.
						   }
						  }
						}
					}
				}
		System.out.println("Below are the duplicate numbers in your list");
		for(int x:al) {  // ADVANCED FOR LOOP TO ITERATE THROUGH ARRAY LIST AND PRINT ALL VALUES FROM IT.
			System.out.print(x);
			System.out.print(",");
		}
	} //End of Method findDup()
		

	public static void main(String[] args) {
		findDup();
	}
} // ENd of classs

