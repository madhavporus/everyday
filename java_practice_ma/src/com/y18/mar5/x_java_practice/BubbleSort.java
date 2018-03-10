package com.y18.mar5.x_java_practice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BubbleSort {
	public static void main(String[] args) {
		bubbleSort();	
	}
	
	
	public static void bubbleSort() {
		int in,out,alen,tmp;
		int[] myarray= {93,60, 20, 18,101,0,2,6,4,8,3};
		alen = myarray.length;
		
		for(in=0;in<alen-1;in++) {
			for(out=0;out<alen-1;out++) {
				if(myarray[out]>myarray[out+1]) {
					tmp=myarray[out];
					myarray[out]=myarray[out+1];
					myarray[out+1]=tmp;
				}
			}
		}
		int d=1;
		for(int y=0;y<alen;y++) {
			System.out.println(d+") "+myarray[y]);
			d++;
		}
		
		
		}
}