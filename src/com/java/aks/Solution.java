package com.java.aks;

public class Solution {

public static void main(String[] args) 
{
	Animal[] animals = new Animal[]{
			new Bird(),
			new Duck(),
			new Chicken(),
			new Rooster(),
			new Parrot(),
			//new Fish(),
			new Shark(),
			new Clownfish(),
			//new Dolphin(),
			//new Frog(),
			new Dog(),
			new Butterfly(),
			new Cat()
			};
	
	 int countFlying = 0 ;
	   int countWalk = 0 ;
	   int countSing = 0 ;
	   int countSwim = 0 ;
	   for (Animal animal : animals) {
		   System.out.println(animal.getClass().getName() + "#####################");
		   if(animal.fly())
			   countFlying++;
		    if(animal.walk())
			   countWalk++;
		    if(animal.sing())
			   countSing++;
		    if(animal.swim())
			   countSwim++;
		    System.out.println("#########################################");
	}
	   System.out.println("Number of Animals that can fly: " + countFlying);
	   System.out.println("Number of Animals that can walk: " + countWalk);
	   System.out.println("Number of Animals that can sing: " + countSing);
	   System.out.println("Number of Animals that can swim: " + countSwim);
	}

}