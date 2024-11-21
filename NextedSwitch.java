package com.demo2;

import java.util.Scanner;

public class NextedSwitch {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String course ="java";
		switch(course) {
		case "python":
		System.out.println("Python is a simple coding language");
			break;
		case "java":
			System.out.println("What version are you using");
			break;	
		
		}
		int version =scr.nextInt();
		
		switch(version) {
		case 6:
			System.out.println("That is old version");
			break;
		case 8:
			System.out.println("Wow nice version");
			break;
		
		}
	}

}
