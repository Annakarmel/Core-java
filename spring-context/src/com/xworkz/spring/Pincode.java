package com.source.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Pincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Double> map = new LinkedHashMap<String,Double>();
		map.put("Bagalkot", 587101D);
		map.put("Vidyagiri", 587102D);
		map.put("Navanagar", 587103D);
		map.put("Mudhol", 587313D);
		map.put("Bangalore  Rural", 560060D);
		map.put("Bangalore", 560001D);
		map.put("Badami", 587201D);
		map.put("Banahatti", 587311D);
		map.put("Bilgi", 587113D);
		map.put("Guledgudd", 587203D);
		
		
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
