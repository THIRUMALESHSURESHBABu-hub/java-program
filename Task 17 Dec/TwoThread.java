package com.demo2;

class Odd extends Thread{
	public void run() {
		try {
			int num = 20;
			for(int i=1; i<=20;i++) {
				if(i%2==1) {
					System.out.println("It is odd number"+i);
				}
				}
			
		}catch(Exception e) {
			System.out.println("Exception is catched");
			
		}
	}
}
class Even extends Thread{
	public void run() {
		try {
			int num = 20;
			for(int i=1; i<=20;i++) {
				if(i%2==0) {
					System.out.println("It is Even number"+i);
				}
				}
			
		}catch(Exception e) {
			System.out.println("Exception is catched");
			
		}
	}
}


public class TwoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Odd obj = new Odd();
       Even obj1= new Even();
       obj.start();
       obj1.start();
	}

}
