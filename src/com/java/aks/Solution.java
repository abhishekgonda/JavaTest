package com.java.aks;

import java.util.ArrayList;
import java.util.List;

public class Solution {

public static void main(String[] args) 
{
	  Rooster myRstr = new Rooster();
	   List<String> arrayList = new ArrayList<String>(){{
		    add("English");
	        add("Danish");
	        add("Dutch");
	        add("Finnish");
	        add("French");
	        add("German");
	        add("Greek");
	        add("Hebrew");
	        add("Hungarian");
	        add("Italian");
	        add("Japanese");
	        add("Portuguese");
	        add("Russian");
	        add("Swedish");
	        add("Turkish");
	        add("Urdu");
		}}; 

		for (String lang : arrayList) {
			myRstr.sing(lang);
		}
	}

}
