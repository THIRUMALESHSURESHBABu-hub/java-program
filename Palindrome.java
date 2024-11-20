package com.demo2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the name");
		
		String s = scr.nextLine();
		int size=s.length();
		
		for(int i=size-1;i>=0;i--) {
			
			str = str+s.charAt(i);
			
		}
		if(s.equals(str)) {
			System.out.println("This is palindrome:"+s);
			
			
		}else {
			System.out.println("This is not palidrome:"+s);
		}
	}

}
