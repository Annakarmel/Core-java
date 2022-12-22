package com.xworkz.collection.collectionExamples;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Watch {

	public static void main(String[] args) {
		String watch1 = "Fastrack";
		String watch2 = "Titan";
		String watch3 = "Quartz";
		String watch4 = "Adamo";
		String watch5 = "Sonata";
		
	    Collection<String> watch = new LinkedList<String>();
	    watch.add(watch1);
	    watch.add(watch2);
	    watch.add(watch3);
	    watch.add(watch4);
	    watch.add(watch5);
	    
	    System.out.println(watch);
	    
	    for(String element : watch) {
	    	System.out.println(element);
	    }
	    
	    System.out.println("Accessed using iterator");
	    
	    Iterator<String> ref = watch.iterator();
	    while(ref.hasNext()) {
	    	String value = ref.next();
	    	System.out.println(value);
	    }
	}
}
	    

