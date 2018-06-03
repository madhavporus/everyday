package com.java.algorithms.ma;

public class BubbleSortMA {

	
	public static void main(String args[]) {
		//bubbleSortByWhileAndFarWithBool();
		bubbleSortby2Fars();
	}
	
	public static void bubbleSortByWhileAndFarWithBool() {
		
		//int arr[] = { 21, 99, 87, 18, 3, 40, 0, 7, 3, 18};
		int arr[] = { 9,4,33,2,19,8};
		int tmp;
		Boolean flag = true;
		
		while(flag==true) {
			flag = false;
			for(int i=0; i<arr.length-1;i++) {
				int x = arr.length-1;
				if(arr[i]>arr[i+1]) {
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					flag=true;
				}
		}
		}
		System.out.println("SORTED ARRAY IS:");
		for (int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}
//---------------------------------------------
	public static void bubbleSortby2Fars(){
        int A[]={99,9,4,6,2,4,1,8,5,0,3,35};
        int tmp;
         
        for(int out = A.length-1; out>0;out--){
         for(int i=1;i<A.length;i++){
            if( A[i-1] > A[i]){
                tmp = A[i-1];
                A[i-1] = A[i];
                A[i] = tmp;
            }
            
         }
        }
         for(int x:A){  //Enhanced For loop
         System.out.println(x);
          }
     }
	
	
	
}
