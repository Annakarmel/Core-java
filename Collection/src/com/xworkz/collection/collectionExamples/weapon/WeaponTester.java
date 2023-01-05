package com.xworkz.collection.collectionExamples.weapon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeaponTester {

	public static void main(String[] args) {
		WeaponDTO weapon1 = new WeaponDTO("Stick", "Sneha", LocalDate.of(2000, 1, 12), 10, Type.plastic);
		WeaponDTO weapon2=new WeaponDTO("Knife", "Vishala", LocalDate.of(2001, 2, 4), 20, Type.gold); 
		WeaponDTO weapon3=new WeaponDTO("Blade", "Swati", LocalDate.of(2022, 12, 17), 30, Type.iron); 
		WeaponDTO weapon4=new WeaponDTO("Ax", "Muskan", LocalDate.of(1996, 3, 21), 40,Type.silver); 
		WeaponDTO weapon5=new WeaponDTO("Sword", "Manu", LocalDate.of(1857, 8, 10), 50,Type.gold); 
		WeaponDTO weapon6=new WeaponDTO("Spear", "Sahana", LocalDate.of(1747, 1, 15), 60,Type.iron); 
		WeaponDTO weapon7=new WeaponDTO("Pike", "Subbi", LocalDate.of(2010, 10, 30), 70,Type.iron); 
		WeaponDTO weapon8=new WeaponDTO("Lance", "Anu", LocalDate.of(2020, 8, 10), 80,Type.plastic); 
		WeaponDTO weapon9=new WeaponDTO("Halberd", "Kashu", LocalDate.of(2022, 1, 11), 90,Type.gold); 
		WeaponDTO weapon10=new WeaponDTO("Boomerang", "Akshata", LocalDate.of(2023, 5, 1), 100,Type.plastic); 
		WeaponDTO weapon11=new WeaponDTO("Crossbow", "Shilpa", LocalDate.of(1988, 12, 10), 110,Type.iron); 
		WeaponDTO weapon12=new WeaponDTO("Bolo", "Asha", LocalDate.of(2004, 12, 12), 120,Type.plastic);
		WeaponDTO weapon13=new WeaponDTO("Flamethrower", "Laxmi", LocalDate.of(2006, 9, 16), 130,Type.silver); 
		WeaponDTO weapon14=new WeaponDTO("Grenade", "Shankar", LocalDate.of(1999, 3, 16), 140,Type.gold); 
		WeaponDTO weapon15=new WeaponDTO("Missele", "Shreedhara", LocalDate.of(2001, 1, 10), 150,Type.iron); 
		WeaponDTO weapon16=new WeaponDTO("Rifle", "Shreeshail", LocalDate.of(2000, 1, 10), 160,Type.silver); 
		WeaponDTO weapon17=new WeaponDTO("Rocket", "Sanvi", LocalDate.of(2000, 1, 10), 170,Type.iron); 
		WeaponDTO weapon18=new WeaponDTO("Pinna", "Sanjana", LocalDate.of(2000, 1, 10), 180,Type.plastic); 
		WeaponDTO weapon19=new WeaponDTO("Shotgun", "Soujanya", LocalDate.of(2000, 1, 10), 190,Type.gold); 
		WeaponDTO weapon20=new WeaponDTO("Revolver", "Sannidhi", LocalDate.of(2000, 1, 10), 200,Type.silver); 

		Collection<WeaponDTO> collection = new ArrayList<WeaponDTO>();
		Set<WeaponDTO> weaponDTO = Stream.of(weapon1,weapon10,weapon11,weapon12,weapon13,weapon14,weapon15,
											weapon16,weapon17,weapon18,weapon19,weapon2,weapon20,weapon3,weapon3,
											weapon4,weapon5,weapon6,weapon7,weapon8,weapon9).collect(Collectors.toSet());
		weaponDTO.stream().map((e)->{
			if (e.getPrice()>50) 
				return e;
			return "NA";
			})
		.collect(Collectors.toSet())
		.forEach((e)->{System.out.println(e);});
		
		
		System.out.println("sort below by name");
		Comparator<WeaponDTO> comparator1 = ((p1,p2)->p1.getName().compareTo(p2.getName()));		
		weaponDTO.stream().sorted(comparator1).forEach(e->System.out.println(e));
		
		System.out.println("sort below by price asc-------------------------------------------");
		Comparator<WeaponDTO> comparator2 = ((p1,p2)->Double.compare(p1.getPrice(), p2.getPrice()));		
		weaponDTO.stream().sorted(comparator2).forEach(e->System.out.println(e));

		System.out.println("sort below by price des-------------------------------------------");
		Comparator<WeaponDTO> comparator3 = ((p1,p2)->Double.compare(p2.getPrice(), p1.getPrice()));			
		weaponDTO.stream().sorted(comparator3).forEach(e->System.out.println(e));

		System.out.println("sort below by madeby asc-------------------------------------------");
		Comparator<WeaponDTO> comparator4 = ((p1,p2)->p1.getMadeBy().compareTo(p2.getMadeBy()));			
		weaponDTO.stream().sorted(comparator4).forEach(e->System.out.println(e));
		
		System.out.println("sort below by madeby des-------------------------------------------");
		Comparator<WeaponDTO> comparator5 = ((p1,p2)->p2.getMadeBy().compareTo(p1.getMadeBy()));			
		weaponDTO.stream().sorted(comparator5).forEach(e->System.out.println(e));
		
		System.out.println("sort below by madeon asc-------------------------------------------");
		Comparator<WeaponDTO> comparator6 = ((p1,p2)->p1.getDate().compareTo(p2.getDate()));			
		weaponDTO.stream().sorted(comparator6).forEach(e->System.out.println(e));
		
		System.out.println("sort below by madeon asc-------------------------------------------");
		Comparator<WeaponDTO> comparator7 = ((p1,p2)->p2.getDate().compareTo(p1.getDate()));			
		weaponDTO.stream().sorted(comparator7).forEach(e->System.out.println(e));
	}

}
