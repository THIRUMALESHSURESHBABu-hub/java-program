package com.demo2;
abstract class Animal{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("sleep");
	}
	
}
class Pig extends Animal{
	public  void animalSound() {
		System.out.println("Pig says: we we");
	}
	
}
public  class Abstraction {
	public static void main (String []args) {
		Pig p = new Pig(); 
		p.animalSound();
		p.sleep();
			
	}
	
}

