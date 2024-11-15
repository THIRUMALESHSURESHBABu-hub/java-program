package com.demo2;

public class AddTwoNumber {
	
	static int addnumber(int num1,int num2) {
		return num1+num2;
		
	}

	public static void main(String[] args) {
		
		int number1 = 10;
		int number2 = 20;
		
		int sum = addnumber(number1 , number2);
		
		System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
		
	}

}
