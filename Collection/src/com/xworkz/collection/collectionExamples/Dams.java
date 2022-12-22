package com.xworkz.collection.collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dams {

	public static void main(String[] args) {
		
		Collection<String> damsInKarnataka = new ArrayList<String>();
		damsInKarnataka.add("KRS");
		damsInKarnataka.add("Almatti");
		damsInKarnataka.add("TB");
		damsInKarnataka.add("Harangi");
		damsInKarnataka.add("Narayanpur");
		
		System.out.println("Dams in Karnataka: "+damsInKarnataka);//Total: 13
		
		Collection<String> damsInKerala = new ArrayList<String>();
		damsInKerala.add("Kallada");
		damsInKerala.add("Idukki");
		damsInKerala.add("Kanhira");
		damsInKerala.add("Periyar");
		damsInKerala.add("Walayar");
		
		System.out.println("Dams in Kerala: "+damsInKerala);//Total: 58
		
		Collection<String> damsInTamilNadu = new ArrayList<String>();
		damsInTamilNadu.add("Aliyar");
		damsInTamilNadu.add("Barur");
		damsInTamilNadu.add("Krishnagiri");
		damsInTamilNadu.add("Mettur");
		damsInTamilNadu.add("Poondi");

		System.out.println("Dams in Tamil nadu: "+damsInTamilNadu);//Total: 116

		Collection<String> damsInKanyakumari = new ArrayList<String>();
		damsInKanyakumari.add("Aruvikkara");
		damsInKanyakumari.add("Kuttiyar");
		damsInKanyakumari.add("Madupetty");
		damsInKanyakumari.add("Peppara");
		damsInKanyakumari.add("Sholayar");

		System.out.println("Dams in Kanyakumari: "+damsInKanyakumari);//Total: 91
		
		Collection<String> damsInGoa = new ArrayList<String>();
		damsInGoa.add("Anjunam");
		damsInGoa.add("MI");
		damsInGoa.add("Salaulim");

		System.out.println("Dams in Goa: "+damsInGoa);//Total: 3
		
		Collection<String> damsInJammuAndKashmir = new ArrayList<String>();
		damsInJammuAndKashmir.add("Pakal Dul");
		damsInJammuAndKashmir.add("Baglihar");
		damsInJammuAndKashmir.add("Dulhasti");
		damsInJammuAndKashmir.add("Salal");
		damsInJammuAndKashmir.add("Kishenganga Dam");

		System.out.println("Dams in Jammu and Kashmir: "+damsInJammuAndKashmir);//Total: 9
		
		Collection<String> damsInDelhi = new ArrayList<String>();
		damsInDelhi.add("Renukaji dam");

		System.out.println("Dams in Delhi: "+damsInDelhi);//Total: 1
		
		Collection<String> damsInMaharastra = new ArrayList<String>();
		damsInMaharastra.add("Natunagar");
		damsInMaharastra.add("Mandohol");
		damsInMaharastra.add("Kashyapi");
		damsInMaharastra.add("Bhushi");
		damsInMaharastra.add("Aswali");

		System.out.println("Dams in Maharastra: "+damsInMaharastra);//Total: 100
		
		Collection<String> damsInMadhyaPradesh = new ArrayList<String>();
		damsInMadhyaPradesh.add("Adner");
		damsInMadhyaPradesh.add("Ama");
		damsInMadhyaPradesh.add("Amadehi");
		damsInMadhyaPradesh.add("Amba");
		damsInMadhyaPradesh.add("Bari");

		System.out.println("Dams in Madhya Pradesh: "+damsInMadhyaPradesh);//Total: 763
		
		Collection<String> damsInAndhraPradesh = new ArrayList<String>();
		damsInAndhraPradesh.add("Ahobilam Dam");
		damsInAndhraPradesh.add("Akkapalem Dam");
		damsInAndhraPradesh.add("Alaganoor Dam");
		damsInAndhraPradesh.add("Ananthasagarm Dam");
		damsInAndhraPradesh.add("Andhra Dam");
		
		System.out.println("Dams in Andhra Pradesh: "+damsInAndhraPradesh);//Total: 129

		Collection<String> damsInTelangana = new ArrayList<String>();
		damsInTelangana.add("Ada Village - Peddavagu");
		damsInTelangana.add("Akkampalli");
		damsInTelangana.add("Bandlavagu, Kukkalgudur");
		damsInTelangana.add("Bazarthathnur");
		damsInTelangana.add("Bethampudi");
		damsInTelangana.add("Bheemanpally");
		
		System.out.println("Dams in Telangana: "+damsInTelangana);//Total: 15

		Collection<String> damsInGujarat = new ArrayList<String>();
		damsInGujarat.add("Aamli Chharchhoda");
		damsInGujarat.add("Abhalwad");
		damsInGujarat.add("Adhia");
		damsInGujarat.add("Adhochhani");
		damsInGujarat.add("Adhoi- I");
		
		System.out.println("Dams in Gujarat: "+damsInGujarat);//Total: 506
		
		Collection<String> damsInChhattisgarh = new ArrayList<String>();
		damsInChhattisgarh.add("Tandula");
		damsInChhattisgarh.add("Dudhawa");
		damsInChhattisgarh.add("Gangrel");
		damsInChhattisgarh.add("Kherkatta Reservoir");
		damsInChhattisgarh.add("Murrum Silli");
		damsInChhattisgarh.add("Sondur");

		System.out.println("Dams in Chhattisgarh: "+damsInChhattisgarh);//Total: 7

		Collection<String> damsInArunachalPradesh = new ArrayList<String>();
		damsInArunachalPradesh.add("Ranganadi Dam");
		damsInArunachalPradesh.add("Subansiri Lower HE Dam");
	
		System.out.println("Dams in ArunachalPradesh: "+damsInArunachalPradesh);//Total: 2
		
		Collection<String> damsInNagaland = new ArrayList<String>();
		damsInNagaland.add("Hep Dam");
		System.out.println("Dams in Nagaland : " + damsInNagaland); // Total: 1
		
		Collection<String> damsInManipur = new ArrayList<String>();
		damsInManipur.add("Khoupum Dam");
		damsInManipur.add("Khuga Dam");
		damsInManipur.add("Singda Dam");
		damsInManipur.add("Thoubal Dam");
		System.out.println("Dams in Manipur : " + damsInManipur); // Total: 4
		
		Collection<String> damsInMizoram = new ArrayList<String>();
		damsInMizoram.add("Serlui B Dam ");
		damsInMizoram.add("Tuirial Dam");
		System.out.println("Dams in Mizoram : " + damsInMizoram);//Total : 2
		
		Collection<String> damsInAssam = new ArrayList<String>();
		damsInAssam.add("Karbi Langpi Dam");
		damsInAssam.add("Umrong Dam");
		System.out.println("Dams in Assam : " + damsInAssam);//Total: 2
		
		Collection<String> damsInMeghalaya = new ArrayList<String>();
		damsInMeghalaya.add("Khandong Dam");
		damsInMeghalaya.add("Kyrdemkulai Dam");
		damsInMeghalaya.add("Mawphlang Dam");
		damsInMeghalaya.add("Myntdu-Leshka Dam");
		damsInMeghalaya.add("Nongkhyllem Dam");

		System.out.println("Dams in Meghalaya : " + damsInMeghalaya);//total: 7
		
		Collection<String> damsInTripura = new ArrayList<String>();
		damsInTripura.add("Gumti Hydro Dam");
		System.out.println("Dams in Tripura : " + damsInTripura);//Total: 1

		Collection<String> damsInWestBengal = new ArrayList<String>();
		damsInWestBengal.add("Bakreshwar Dam");
		damsInWestBengal.add("Bandhu Dam");
		damsInWestBengal.add("Bara Mandira Dam");
		damsInWestBengal.add("Barabhum Dam");
		damsInWestBengal.add("Beko Dam");
		
		System.out.println("Dams in WestBengal : " + damsInWestBengal);//Total: 33

		Collection<String> damsInSikkim = new ArrayList<String>();
		damsInSikkim.add("Rangit III Dam");
		damsInSikkim.add("Rangpo Dam");
		damsInSikkim.add("Rongli Dam");
		damsInSikkim.add("Teesta -V (NHPC) Dam");
		damsInSikkim.add("Teesta-III Dam");
		damsInSikkim.add("Teesta-IV Dam");
		
		System.out.println("Dams in Sikkim : " + damsInSikkim);//Total: 6

		Collection<String> damsInBihar = new ArrayList<String>();
		damsInBihar.add("Ajan Dam");
		damsInBihar.add("Amrity Dam");
		damsInBihar.add("Badua Dam");
		damsInBihar.add("Barnar Dam");
		damsInBihar.add("Baskund Dam");
		damsInBihar.add("Belharna Dam");
		
		System.out.println("Dams in Bihar : " + damsInBihar);//Total: 24

		Collection<String> damsInJharkhand = new ArrayList<String>();
		damsInJharkhand.add("Amanat Dam");
		damsInJharkhand.add("Anjanwa Dam");
		damsInJharkhand.add("Anraj Dam");
		damsInJharkhand.add("Baksa/Buksa Dam");
		damsInJharkhand.add("Bandha Dam");
		damsInJharkhand.add("Baranadi Dam");
		damsInJharkhand.add("Barhi Dam");
			
		System.out.println("Dams in Jharkhand : " + damsInJharkhand);//43

		Collection<String> damsInOdisha = new ArrayList<String>();
		damsInOdisha.add("Alubani Dam");
		damsInOdisha.add("Aradei Dam");
		damsInOdisha.add("Arikul Dam");
		damsInOdisha.add("Badabandha Dam");
		damsInOdisha.add("Badanalla Dam");
		damsInOdisha.add("Badjore Dam");
		
		System.out.println("Dams in Odisha : " + damsInOdisha);//163
		
		
		Collection<String> damsInIndia = new ArrayList<String>();
		damsInIndia.addAll(damsInKarnataka);
		damsInIndia.addAll(damsInKerala);
		damsInIndia.addAll(damsInTamilNadu);
		damsInIndia.addAll(damsInAndhraPradesh);
		damsInIndia.addAll(damsInTelangana);
		damsInIndia.addAll(damsInGoa);
		damsInIndia.addAll(damsInGujarat);
		damsInIndia.addAll(damsInChhattisgarh);
		damsInIndia.addAll(damsInArunachalPradesh);
		damsInIndia.addAll(damsInNagaland);
		damsInIndia.addAll(damsInManipur);
		damsInIndia.addAll(damsInMizoram);
		damsInIndia.addAll(damsInAssam);
		damsInIndia.addAll(damsInMeghalaya);
		damsInIndia.addAll(damsInTripura);
		damsInIndia.addAll(damsInWestBengal);
		damsInIndia.addAll(damsInSikkim);
		damsInIndia.addAll(damsInBihar);
		damsInIndia.addAll(damsInJharkhand);
		damsInIndia.addAll(damsInOdisha);
			
		System.out.println(damsInIndia);
		
		System.out.println("------------------------------------------------------------------------------------");
		for(String dams : damsInIndia) {
			System.out.println(dams);
		}
		
		System.out.println("------------------------------------------------------------------------------------");
		boolean contains = damsInIndia.contains("KRS");
		System.out.println("contains KRS "+contains);
		
		boolean contains1=damsInIndia.contains("Aradei Dam");
		System.out.println("contains Aradei "+contains1);
		
		boolean contains2 =damsInIndia.contains("anu");
		System.out.println("contains anu "+contains2);
		
		System.out.println("------------------------------------------------------------------------------------");
		
		boolean removed = damsInIndia.remove("Anjanwa Dam");
		System.out.println(removed);
		
		
		Iterator<String>  dms = damsInIndia.iterator();
		System.out.println("-----------------element start with B-------------------------");
		while(dms.hasNext()) {
			String element1=dms.next();

			if(element1.startsWith("B")) {
				
				System.out.println(element1);
			}
		}
		

		Iterator<String>  dms1 = damsInIndia.iterator();
		System.out.println("-----------------element ends with a-----------------------");
		while(dms1.hasNext()) {
			String element2=dms1.next();

			if(element2.endsWith("a")) {
				
				System.out.println(element2);
			}
		}
		
	}
}
