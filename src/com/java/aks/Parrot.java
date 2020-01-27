package com.java.aks;

public class Parrot extends Bird{
 
   Animal animal=null;
   void livingNear(Animal animal)
   {
	 this.animal =animal;
	  
   }
   @Override
 	  public boolean sing() {
		animal.sing();
		return true;
	}

}
