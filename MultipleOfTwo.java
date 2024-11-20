package com.demo2;

import java.util.Scanner;

public class MultipleOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int num = scr.nextInt();
		
		if(num %2==0) {
			
			System.out.println("This is multiple of 2:"+num);
			
		}else {
			System.out.println("This is not multiple of :"+num);
		}

	}

}
