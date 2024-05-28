package service;


import java.util.HashMap;
import java.util.Map.Entry;

import model.City;

public class MainService {

	public static void main(String [] args) {
		HashMap<String, City> map = new HashMap<>();
		
		if(!map.containsKey("Ventspils"))
			map.put("Ventspils",new City("Ventspils", 32000, "Janis", "Vitolins"));
		
		if(!map.containsKey("Rīga"))
			map.put("Rīga",new City("Rīga", 100000, "Vilnis", "Ķirsis"));
		if(!map.containsKey("Liepāja"))
			map.put("Liepāja",new City("Liepāja", 32000, "Janis", "Vitolins"));
		
		map.put(null,null);
		System.out.println(map.get("Ventspils"));
		System.out.println("---VISI DATI----");
		for(Entry<String,City> temp: map.entrySet())
		{
			System.out.println(temp);
		}
		
	}
	
}
