package com.demo;

public class ArmstrongNum {
	
	public static void oneToThousandArmstrongNum() {
		 
		int a= 0;
		
		int b = a;
		
		for(int i = 1; i <= 1000; i++) {
			
			System.out.println(1);
		}
	}
	
	public static void ArmstrongNum() {
	
	int a = 153;               //sum of the power of the digit
	
	int b = a;
	
	int arm = 0;
	
	while(a > 0 ) {
		
		int rem = a%10;
		
		arm = arm +(rem*rem*rem);
		
		a = a/10;
	}
	if(b == arm ) {
		
		System.out.println(arm+  "is an Armstrong Number ");
	}
	else {
		System.err.println("it's a not Amrstrong Number");
	}
	
	}
	
	

	public static void main (String[]args) {
		
		ArmstrongNum();
//		oneToThousandArmstrongNum();
	}
	
	
}
