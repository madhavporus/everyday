package com.y18.mar5.x_java_practice;

import java.util.ArrayList;

public class IQuestions {
// MAIN METHOD TO CALL THE 'countOfDistinctPair()' WHICH IS IMPLEMENTED ABOVE.
	public static void main(String[] args) {
		countOfDistinctPair();
	}
/* #1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1
Source for this problem is: https://www.geeksforgeeks.org/count-pairs-difference-equal-k/
Shared by prasanth mediboina*/
	
	public static void countOfDistinctPair() {
		int aLength, internalCounter,iinternalCounter,externalCounter, numberOftimesCounter=0;
		int k = 2;
		int[] mainnums = {0,1,4,6,8,9,10,12,14};
	    int firstSet, secondSet;
		aLength = mainnums.length;
	
		System.out.println("Length of the array is: "+aLength);
		externalCounter = 1;
		
		ArrayList<Integer> s1 = new ArrayList<Integer>();
		ArrayList<Integer> s2 = new ArrayList<Integer>();
		
		System.out.println();
		for(iinternalCounter=1;iinternalCounter<aLength;iinternalCounter++) {
			firstSet = aLength-externalCounter;		
			for(internalCounter=1;internalCounter<aLength;internalCounter++) {
				secondSet = aLength-(internalCounter+1);
				if((mainnums[firstSet] - mainnums[secondSet]) == k) {
					// BELOW 2 STPES ARE TO ADD THE FIRST AND SEND NUMBER TO 2 DIFFERENT ARRAYLIST
					// TO USE THEM FOR PRINTING OUT.
					s1.add(mainnums[firstSet]); // ADDING FIRT NUMBER
					s2.add(mainnums[secondSet]);// ADDING SECOND NUMBER			
					numberOftimesCounter++;
				}
			}
			externalCounter++;
		}
		System.out.println("There are "+numberOftimesCounter+" numbers which has difference of "+k);
		for(int i=0; i<s1.size();i++) {
			System.out.println("Set#"+i+" is:"+s1.get(i)+" and "+s2.get(i));
		}
	}
// #1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1--#1
} // END OF THE CLASS  ((((BY MADHAVA))))
