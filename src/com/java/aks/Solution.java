package com.java.aks;

public class Solution {

public static void main(String[] args) 
{
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		
		Animal duck =  new Duck();
		duck.walk();
		duck.fly();
		duck.sing();
		
		Animal chicken =  new Chicken();
		chicken.walk();
		chicken.fly();
		chicken.sing();
	}
}