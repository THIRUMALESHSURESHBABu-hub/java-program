package com.demo2;

import java.util.Scanner;

public class LeapYearProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Year:");
		
		int n = s.nextInt();
		
		if((n%4==0 && n%100!=0)||(n%400==0)){
			
			System.out.println(n+ "  is a leap year");
			
		}else {
			System.out.println(n+ " is not a Leap Year");
		}
		
	}
	

}
