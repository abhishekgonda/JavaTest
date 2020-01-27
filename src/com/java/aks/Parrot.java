package com.java.aks;

public class Parrot extends Bird{
 
	Animal animal=null;
	   void livingNear(Animal animal)
	   {
		 this.animal =animal;
		  
	   }
	   public boolean fly() {
			System.out.println("I am flying");
			return true;
			}

		  public boolean sing() {
	if(null==animal)
	{
		 this.livingNear(new Duck());
	}
			animal.sing();
			return true;
		}

		@Override
		public boolean walk() {
			
				System.out.println("I am walking");
			
			return true;
		}

}
