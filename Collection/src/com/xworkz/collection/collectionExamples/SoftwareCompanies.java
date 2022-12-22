package com.xworkz.collection.collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanies {

	public static void main(String[] args) {
		
		String company1 = "TCS";
		String company2 = "Infosys";
		String company3 = "Emphosis";
		String company4 = "Atos";
		String company5 = "Zoho";
		String company6 = "Google";
		String company7 = "Wolken Software";
		String company8 = "Zensar Technologies";
		String company9 = "Icicle Technologies";
		String company10 = "Newgen Software Technologies";
		String company11 = "Globussoft Technologies";
		String company12 = "Shakti Infotech";
		String company13 = "Nortech Infonet";
		String company14 = "XYKA Software";
		String company15 = "Cumulations Technologies";
		String company16 = "Real Soft";
		String company17 = "PTC India";
		String company18 = "Techasoft";
		String company19 = "Jireh Software Solutions";
		String company20 = "Software Data India";

	    Collection<String> company = new ArrayList<String>();
	    company.add(company1);
	    company.add(company2);
	    company.add(company3);
	    company.add(company4);
	    company.add(company5);
	    company.add(company6);
	    company.add(company7);
	    company.add(company8);
	    company.add(company9);
	    company.add(company10);
	    company.add(company11);
	    company.add(company12);
	    company.add(company13);
	    company.add(company14);
	    company.add(company15);
	    company.add(company16);
	    company.add(company17);
	    company.add(company18);
	    company.add(company19);
	    company.add(company20);
	    
	    System.out.println(company);
	    
	    for(String element : company) {
	    	System.out.println(element);
	    }
	    
	    System.out.println("Accessed using iterator");
	    
	    Iterator<String> ref = company.iterator();
	    while(ref.hasNext()) {
	    	String value = ref.next();
	    	System.out.println(value);
	    }
	}

}
