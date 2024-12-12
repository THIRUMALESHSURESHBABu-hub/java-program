package com.demo2;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {2,3,4,5,6};
		 int []arr1= new int[arr.length]; 
		 for(int i=0;i<arr.length;i++) {
			 arr1[i]=arr[i];
		 }
		System.out.println(Arrays.toString(arr1));

	}

}
