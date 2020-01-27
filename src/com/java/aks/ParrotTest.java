package com.java.aks;

public class ParrotTest{
	public static void main(String[] args) { 
		Parrot parrot1 =  new Parrot();
		parrot1.livingNear(new Dog());
		parrot1.sing();

		Parrot parrot2 =  new Parrot();
		parrot2.livingNear(new Cat());
		parrot2.sing();

		Parrot parrot3 =  new Parrot();
		parrot3.livingNear(new Rooster());
		parrot3.sing();

		
	}
}