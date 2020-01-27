package com.java.aks;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {
	
	private static final Map<String, String> langMap;
    static
    {
    	langMap = new HashMap<String, String>();
    	langMap.put("English", "Cock-a-doodle-doo");
    	langMap.put("Danish", "kykyliky");
    	langMap.put("Dutch", "kukeleku");
    	langMap.put("Finnish", "kukko kiekuu");
    	langMap.put("French", "cocorico");
    	langMap.put("German", "kikeriki");
    	langMap.put("Greek", "kikiriki");
    	langMap.put("Hebrew", "coo-koo-ri-koo");
    	langMap.put("Hungarian", "kukuriku");
    	langMap.put("Italian", "chicchirichi");
    	langMap.put("Japanese", "ko-ke-kok-ko-o");
    	langMap.put("Portuguese", "cucurucu");
    	langMap.put("Russian", "kukareku");
    	langMap.put("Swedish", "kuckeliku");
    	langMap.put("Turkish", "kuk-kurri-kuuu");
    	langMap.put("Urdu", "kuklooku");

    }

    
	  
	 public boolean sing(String language) {

		   if(null== language || language.isEmpty())
		   {
			   //default as english
		  System.out.println("Cock-a-doodle-doo");
		   }
		   else
		   {
			   System.out.println(langMap.get(language));
		   }
			   
		
		return true;
	}
}
