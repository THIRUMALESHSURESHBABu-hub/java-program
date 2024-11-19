package com.demo2;

import java.util.Scanner;

public class TablesUsingLoop {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a Number Inbetween 1 to 10");
		
		int n =s.nextInt();
		
		if(n>=1 && n<=10) {
			
			for(int i=1;i<=10;i++) {
				
				System.out.println(n+"x"+i + "=" +(n*i));
			}
			
				
			}else {
				System.out.println("Enter a Number Inbetween 1 to 10");
			}
		
		

	}

}
