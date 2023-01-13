package com.xworkz.springBean.configuration;

import org.springframework.context.annotation.Bean;

import com.xworkz.springBean.boot.Actor;
import com.xworkz.springBean.boot.Bun;
import com.xworkz.springBean.boot.Flower;
import com.xworkz.springBean.boot.Puff;
import com.xworkz.springBean.boot.Rocket;
import com.xworkz.springBean.boot.Season;

public class Configuration {
	
	
	@Bean
	public Flower rose() {
		System.out.println("Registering another Flower in spring..");
		Flower flower = new Flower();
		return flower;
	}
	
	@Bean
	public Puff egg() {
		System.out.println("Registering another Puff in spring..");
		Puff puff = new Puff("Eggpuff", 25, "Nonveg");
		return puff;
	}
	
	@Bean
	public Bun cream() {
		System.out.println("Registering another bun in spring...");
		Bun bun = new Bun();
		bun.setBakeryName("Pooja");
		bun.setPrice(35);
		return bun;
	}
	
	@Bean
	public Rocket type1() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock = new Rocket();
		return rock;
	}
	
	@Bean
	public Rocket type2() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock1 = new Rocket();
		return rock1;
	}
	
	@Bean
	public Rocket type3() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock2 = new Rocket();
		return rock2;
	}
	
	@Bean
	public Rocket type4() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock4 = new Rocket();
		return rock4;
	}
	
	@Bean
	public Rocket type5() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock5 = new Rocket();
		return rock5;
	}
	
	@Bean
	public Rocket type6() {
		System.out.println("Registring another rocket in spring...");
		Rocket rock6 = new Rocket();
		return rock6;
	}
	
	@Bean
	public Actor name1() {
		System.out.println("Registering another actor in spring...");
		Actor act1 = new Actor("Puneet", "Kannad", 45);
		return act1;
	}
	
	
	@Bean
	public Actor name2() {
		System.out.println("Registering another actor in spring...");
		Actor act2 = new Actor("Ranbeer", "Hindi", 40);
		return act2;
	}
	
	@Bean
	public Actor name3() {
		System.out.println("Registering another actor in spring...");
		Actor act3 = new Actor("AlluArjun", "Telagu", 42);
		return act3;
	}
	
	@Bean
	public Actor name4() {
		System.out.println("Registering another actor in spring...");
		Actor act1 = new Actor("Kajal", "Hindi", 35);
		return act1;
	}
	
	@Bean
	public Actor name5() {
		System.out.println("Registering another actor in spring...");
		Actor act1 = new Actor("Devrkonda", "Tamil", 41);
		return act1;
	}
	
	@Bean
	public Actor name6() {
		System.out.println("Registering another actor in spring...");
		Actor act1 = new Actor("Rashmika", "Malayalam", 28);
		return act1;
	}
	
	@Bean
	public Season month() {
		System.out.println("Registering another season in spring...");
		Season season = new Season();
		season.setName("Winter");
		season.setDuration("4 months");
		season.setStartingMonth("December");
		return season;
	}
	
	@Bean
	public Season month1() {
		System.out.println("Registering another season in spring...");
		Season season1 = new Season();
		season1.setName("Rainy");
		season1.setDuration("5 months");
		season1.setStartingMonth("June");
		return season1;
	}
	
	@Bean
	public Season month2() {
		System.out.println("Registering another season in spring...");
		Season season2 = new Season();
		season2.setName("Spring");
		season2.setDuration("2 months");
		season2.setStartingMonth("January");
		return season2;
	}
	
	@Bean
	public Season month3() {
		System.out.println("Registering another season in spring...");
		Season season3 = new Season();
		season3.setName("Mansoon");
		season3.setDuration("3 months");
		season3.setStartingMonth("August");
		return season3;
	}
	
	@Bean
	public Season month4() {
		System.out.println("Registering another season in spring...");
		Season season4 = new Season();
		season4.setName("Fruit");
		season4.setDuration("1 months");
		season4.setStartingMonth("May");
		return season4;
	}
	
	@Bean
	public Season month5() {
		System.out.println("Registering another season in spring...");
		Season season5 = new Season();
		season5.setName("Middle winter");
		season5.setDuration("1 months");
		season5.setStartingMonth("September");
		return season5;
	}
	

}