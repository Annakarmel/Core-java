package com.source.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Double> map = new LinkedHashMap<String,Double>();
		map.put("Shree Sai PG", 4500D);
		map.put("Laksmhi PG", 4700D);
		map.put("Khushi PG", 6000D);
		map.put("Huli PG", 4400D);
		map.put("Delux PG", 5000D);
		map.put("Luxury PG", 5500D);
		map.put("Assassin PG", 7000D);
		map.put("Lemon PG", 12000D);
		map.put("Shree Lakshmi PG", 4400D);
		map.put("Git PG", 7500D);
		
		System.out.println(map.size());
		
		if(map.isEmpty())
		{
			System.out.println("Pg alli enu ella");
		}
		else
		{
			System.out.println("Pg alli eno ede");
		}
		
		Set<String> keys = map.keySet();
		keys.forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		System.out.println("************Bridge**************");
		
		Collection<Double> collect = map.values();		
		collect.forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		System.out.println("************Bridge**************");
		
		
		Set<Entry<String,Double>> entries = map.entrySet();
		
		for(Entry<String,Double> entry:entries)
		{
			System.out.println(entry.getKey()+"-->"+entry.getValue());
			
		}	
	}

}
