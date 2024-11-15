package com.demo2;

public class LogicAndRelational {

	public static void main(String[] args) {
		
		int a=10,b=20;
		
		int x = 21,y = 23;
		
		
		// relational operation
		
		System.out.println(" Relational Operators");
		System.out.println(" a==b :"+ (a==b));  // equal to
		System.out.println(" a!=b :"+ (a!=b));  // not equal to
		System.out.println(" a > b :"+ (a > b)); // greater than
		System.out.println(" a < b :"+ (a <b));  // less than
		System.out.println(" a>=b :"+ (a>=b));   // greater than equal to
		System.out.println(" a<=b :"+ (a<=b));   // less than equal to
		
		System.out.println(" Logical operators");
		
		System.out.println(" a&&B:"+ ((a>b)&&(a<b))); //and operator
		System.out.println(" a||B:"+ ((a>b)||(a<b))); // or operator
		System.out.println(" a!=B:"+ ((a>b)!=(a<b))); // not equal to
		

	}

}
