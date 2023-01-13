package com.source.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class City {

	public static void main (String[] assassin)
	{
		
		Map<String,Double> map = new LinkedHashMap<String,Double>();
		map.put("Bagalkot", 42.6);
		map.put("Bangalore", 25.6);
		map.put("Bidar", 32.4);
		map.put("Belagavi", 44.6);
		map.put("Vijapur", 22.6);
		map.put("mudhol", 36.6);
		map.put("Badami", 42.2);
		map.put("Vidyagiri", 25.3);
		map.put("Mumbai", 39.6);
		map.put("J&K", -10D);
		map.put("Delhi", 26.7);
		
	System.out.println(map.size());
		
		if(map.isEmpty())
		{
			System.out.println("Bagalkot alli enu ella");
		}
		else
		{
			System.out.println("Bagalkot alli eno ede");
		}
		
		Set<String> set = map.keySet();
		set.forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		System.out.println("**********Bridge************");
		
		Collection<Double> collect = map.values();
		collect.forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		System.out.println("**********Bridge************");
		
		Set<Entry<String,Double>> entries = map.entrySet();
		
		for(Entry<String,Double> entry:entries)
		{
			System.out.println(entry.getKey()+"-->"+entry.getValue());
			
		}
		
		
		
		
		
		
		
		
		
	}
}
