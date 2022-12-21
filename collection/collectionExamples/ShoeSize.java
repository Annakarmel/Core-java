package com.xworkz.collection.collectionExamples;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ShoeSize {

	public static void main(String[] args) {
		
		int shoeSize1 = 6;
		int shoeSize2 = 7;
		int shoeSize3 = 8;
		int shoeSize4 = 5;
		int shoeSize5 = 9;
		int shoeSize6 = 10;
		int shoeSize7 = 11;
		int shoeSize8 = 12;
		int shoeSize9 = 13;
		int shoeSize10 = 15;
		int shoeSize11 = 16;
		int shoeSize12 = 18;
		int shoeSize13 = 19;
		int shoeSize14 = 20;
		int shoeSize15 = 21;
		
	    Collection<Integer> size = new LinkedHashSet<Integer>();
	    size.add(shoeSize1);
	    size.add(shoeSize2);
	    size.add(shoeSize3);
	    size.add(shoeSize4);
	    size.add(shoeSize5);
	    size.add(shoeSize6);
	    size.add(shoeSize7);
	    size.add(shoeSize8);
	    size.add(shoeSize9);
	    size.add(shoeSize10);
	    size.add(shoeSize11);
	    size.add(shoeSize12);
	    size.add(shoeSize13);
	    size.add(shoeSize14);
	    size.add(shoeSize15);

	    System.out.println(size);
	    
	    for(int element : size) {
	    	System.out.println(element);
	    }
	    
	    System.out.println("Accessed using iterator");
	    
	    Iterator<Integer> ref = size.iterator();
	    while(ref.hasNext()) {
	    	Integer value = ref.next();
	    	System.out.println(value);
	    }
	}
}
