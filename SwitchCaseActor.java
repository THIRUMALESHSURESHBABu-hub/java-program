package com.demo2;

import java.util.Scanner;

public class SwitchCaseActor {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a Actors");
		
		String actor= s.next();		
		
		switch(actor) {
		
		case"vijay":
			System.out.println("1.Thuppakki"+"mersal"+"leo"+"Sura"+"kuruvi");
			System.out.println("Enter the youe fav movie list");
			System.out.println();
			String movies=s.nextLine();
			switch(movies) {
			
			case"Thuppakki":
				System.out.println("Thuppakki is a block buster");
			break;
			case"mersal":
				System.out.println("mersal is a block buster");
			break;
			case"leo":
				System.out.println("leo is a block buster");
			break;
			case"Sura":
				System.out.println("Sura is a Flop movie");
			break;
			case"kuruvi":
				System.out.println("kuruvi is a flop movie");
			break;
			default:
				System.out.println("Enter the movie first letter with captiol ans enter the movies only in above list");
			}
		}

	}

}
