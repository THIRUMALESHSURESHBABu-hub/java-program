package com.demo2;

import java.util.Scanner;

public class Enums {
	     enum course{JAVA,AI,ML}
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter your course");
			 String enums=s.nextLine();
			 course lang = course.valueOf(enums);
			 
			 switch(lang) {
			 
			 case JAVA:
				 System.out.println("Your select java");
				break;
				
			 case AI:
				 System.out.println("Your select AI");
				break;
			 case ML:
				 System.out.println("Your select ML");
				break;
				default:
					System.out.println("Your select wrong input");
			 
			 }
			
			
		}

	}

