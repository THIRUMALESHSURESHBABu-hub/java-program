package com.demo2;

public class ArrayProgram {

	public static void main(String[] args) {
		int sum = 0;
		
		int []a = {5,4,6,4,6,2};
		
		for(int i=0; i<a.length;i++) {
			
			sum=sum+a[i];
		}
		System.out.println(sum);
	

	}

}
