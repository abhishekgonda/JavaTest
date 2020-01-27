package com.java.aks;

public class Cat implements Animal{

	
	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
		
	}

	
	public boolean sing() {
		System.out.println("Meow");
		return true;
		
	}

	
	public boolean walk() {
		System.out.println("I am walking");
		return true;
		
	}

	
	public boolean swim() {
		System.out.println("I can Swim");
		return true;
	}

}
