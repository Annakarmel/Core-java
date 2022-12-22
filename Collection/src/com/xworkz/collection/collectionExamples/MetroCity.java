package com.xworkz.collection.collectionExamples;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class MetroCity {

	public static void main(String[] args) {
		
		String mCity1 = "Mumbai";
		String mCity2 = "Bengalore";
		String mCity3 = "Chennai";
		String mCity4 = "Kolkata";
		String mCity5 = "Pune";
		
	    Collection<String> mCity = new HashSet<String>();
	    mCity.add(mCity1);
	    mCity.add(mCity2);
	    mCity.add(mCity3);
	    mCity.add(mCity4);
	    mCity.add(mCity5);
	    
	    System.out.println(mCity);
	    
	    for(String element : mCity) {
	    	System.out.println(element);
	    }
	    
	    System.out.println("Accessed using iterator");
	    
	    Iterator<String> ref = mCity.iterator();
	    while(ref.hasNext()) {
	    	String value = ref.next();
	    	System.out.println(value);
	    }
	}
}
