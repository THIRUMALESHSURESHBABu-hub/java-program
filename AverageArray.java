package com.demo2;

public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double sum = 0;
       double average=0d;
       double []a = {8,5,3,2,5};
       for(int i=0; i<a.length;i++) {
    	   sum=sum+a[i];
       }
       System.out.println(sum);
       average=sum/a.length;
       System.out.println(average);
	}
	
	

}
