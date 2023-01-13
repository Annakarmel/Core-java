package com.source.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Company {

	public static void main (String[] assassin)
	{
		
		Map<String,String> map = new LinkedHashMap<String,String>();
		map.put("Infosys", "JAVA");
		map.put("Google", "Python");
		map.put("MicroSoft", ".Net");
		map.put("Wipro", "JAVA-SRCIPT");
		map.put("Accentrue", "MY SQL");
		map.put("TCS", "JAVA,.Net");
		map.put("IBM", "C++");
		map.put("Amazon", "JAVA");
		map.put("FaceBook", "C");
		map.put("Instagram", "HTML");
		map.put("Cognizent", "Bootstrap");
		
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
		
		Collection<String> collect = map.values();
		collect.forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		System.out.println("**********Bridge************");
		
		Set<Entry<String,String>> entries = map.entrySet();
		
		for(Entry<String,String> entry:entries)
		{
			System.out.println(entry.getKey()+"-->"+entry.getValue());
			
		}
	}
}
