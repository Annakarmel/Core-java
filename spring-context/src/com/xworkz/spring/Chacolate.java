package com.source.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Chacolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Map<String,Double> map = new LinkedHashMap<String,Double>();
		map.put("Dark Chacolate", 50D);
		map.put("Lava Chacolate", 60D);
		map.put("Cadberry Chacolate", 40D);
		map.put("Ferorro Rochird Chacolate", 30D);
		map.put("Dark-fantasy Chacolate", 90D);
		map.put("Oreo Chacolate", 70D);
		map.put("Perk Chacolate", 120D);
		map.put("Creamy Chacolate", 550D);
		map.put("Liquid Chacolate", 250D);
		map.put("Light Chacolate", 150D);
		
		
		System.out.println(map.size());
		
		if(map.isEmpty())
		{
			System.out.println("Chacolate alli enu ella");
		}
		else
		{
			System.out.println("Chacolate alli eno ede");
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
