package com.demo2;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date format (dd/mm/yyyy)");
		System.out.println("Enter the date :");
		String s1 = sc.next();
		System.out.println("Enter the date month :");
		String s2 = sc.next();
		System.out.println("Enter the date year :");
		String s3 = sc.next();
		int dd=Integer.parseInt(s1);
		int mm=Integer.parseInt(s2);
		int yyyy=Integer.parseInt(s3);
		
		String datestr = (dd+4)+"/"+(mm+4)+"/"+(yyyy+4);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		try {
			Date date =sdf.parse(datestr);
			System.out.println("Input Date :" +sdf.format(date));
		}catch(Exception e){
			System.out.println("Invalid Format");
		}
	}

}
