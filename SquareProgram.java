package com.demo2;

import java.util.Scanner;

public class SquareProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int number = scr.nextInt();
		
		double sqrt = Math.sqrt(number);
		
		if(sqrt ==(int)sqrt) {
			
			System.out.println(number+"is a Prefect square");
		}else {
			System.out.println(number+"is a not Prefect square");
		}

	}

}
