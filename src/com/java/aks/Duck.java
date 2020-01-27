package com.java.aks;

public class Duck extends Bird{
	@Override
	public boolean fly() {
		System.out.println("I am flying");
		return true;
		}
	@Override
	  public boolean sing() {

		System.out.println("Quack, quack");
		return true;
	}
}