package com.demo2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	  
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the name");
		
		String name2=obj.nextLine();
		
		System.out.println("Enter the number");
		
        long number = obj.nextLong();
		
		System.out.println("Enter the Pass ");
		
		short pass = obj. nextShort();
		
		System.out.println("Enter the Desi");
		
		float desimel = obj.nextFloat();
		
		System.out. println("Enter the Name");
		
		String  name1 = obj.next();
		
		System.out.println("Enter the Number2");
		
		double  number2 = obj.nextDouble();
		
        obj.next();
        
        System.out.println("Namel:"+ name2 );
		
		System.out.println("number :"+ number);
		
		System.out.println("pass :"+ pass);
		
		System.out.println("desimel:"+ desimel);
		
		System.out.println("name:"+ name1);
		
		System.out.println("number2:"+ number2);
		

	}

}

