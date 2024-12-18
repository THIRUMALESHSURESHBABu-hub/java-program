package com.demo2;

class Subject extends Thread{
	
	public void run() {
		try{int tamil = 75;
		int english= 89;
		int maths= 78;
		int science=67;
		int social = 98;
		int total= (tamil+english+maths+science+social);
		System.out.println("Sum of all Subjects :"+total);
		float average= total/5;
		System.out.println("Average :"+average);
		}catch(Exception e) {
			System.out.println(" Exception is catched");
		}
	}
}

public class FiveSubjectThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject obj =new Subject();
		obj.start();
	}

}
