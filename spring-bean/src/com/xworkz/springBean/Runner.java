package com.xworkz.springBean;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springBean.boot.Actor;
import com.xworkz.springBean.boot.Bun;
import com.xworkz.springBean.boot.Flower;
import com.xworkz.springBean.boot.Puff;
import com.xworkz.springBean.boot.Rocket;
import com.xworkz.springBean.boot.Season;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(Configuration.class);
		
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		Flower flower = spring.getBean("flower", Flower.class);
		System.out.println(flower);
		System.out.println(flower.getName());
		System.out.println(flower.getPrice());
		System.out.println(flower.getColor());
		
		Flower flower1 = spring.getBean("rose", Flower.class);
		System.out.println(flower1);
		System.out.println(flower1.getName());
		System.out.println(flower1.getPrice());
		System.out.println(flower1.getColor());
		
		Puff puf = spring.getBean("puff", Puff.class);
		System.out.println(puf);
		System.out.println(puf.getName());
		System.out.println(puf.getPrice());
		System.out.println(puf.getType());
		
		Puff puf1 = spring.getBean("egg", Puff.class);
		System.out.println(puf1);
		System.out.println(puf1.getName());
		System.out.println(puf1.getPrice());
		System.out.println(puf1.getType());
		
		Bun bun = spring.getBean("bun", Bun.class);
		System.out.println(bun);
		System.out.println(bun.getBakeryName());
		System.out.println(bun.getPrice());
		
		Bun bun1 = spring.getBean("cream", Bun.class);
		System.out.println(bun1);
		System.out.println(bun1.getBakeryName());
		System.out.println(bun1.getPrice());
		
		Rocket rock = spring.getBean("rocket", Rocket.class);
		System.out.println(rock);
		System.out.println(rock.getName());
		System.out.println(rock.getBudget());
		System.out.println(rock.getContry());
		
		Actor act = spring.getBean("actor", Actor.class);
		System.out.println(act);
		System.out.println(act.getName());
		System.out.println(act.getLang());
		System.out.println(act.getAge());
		
		Actor act1 = spring.getBean("name1", Actor.class);
		System.out.println(act1);
		System.out.println(act1.getName());
		System.out.println(act1.getLang());
		System.out.println(act1.getAge());
		
		Actor act2 = spring.getBean("name2", Actor.class);
		System.out.println(act2);
		System.out.println(act2.getName());
		System.out.println(act2.getLang());
		System.out.println(act2.getAge());
		
		Actor act3 = spring.getBean("name3", Actor.class);
		System.out.println(act3);
		System.out.println(act3.getName());
		System.out.println(act3.getLang());
		System.out.println(act3.getAge());
		
		Actor act4 = spring.getBean("name4", Actor.class);
		System.out.println(act4);
		System.out.println(act4.getName());
		System.out.println(act4.getLang());
		System.out.println(act4.getAge());
		
		Actor act5 = spring.getBean("name5", Actor.class);
		System.out.println(act5);
		System.out.println(act5.getName());
		System.out.println(act5.getLang());
		System.out.println(act5.getAge());
		
		Actor act6 = spring.getBean("name6", Actor.class);
		System.out.println(act6);
		System.out.println(act6.getName());
		System.out.println(act6.getLang());
		System.out.println(act6.getAge());
		
		Season season = spring.getBean("season", Season.class);
		System.out.println(season);
		System.out.println(season.getName());
		System.out.println(season.getDuration());
		System.out.println(season.getStartingMonth());
		
		Season season1 = spring.getBean("month", Season.class);
		System.out.println(season1);
		System.out.println(season1.getName());
		System.out.println(season1.getDuration());
		System.out.println(season1.getStartingMonth());
		
		Season season2 = spring.getBean("month1", Season.class);
		System.out.println(season2);
		System.out.println(season2.getName());
		System.out.println(season2.getDuration());
		System.out.println(season2.getStartingMonth());
		
		Season season3 = spring.getBean("month2", Season.class);
		System.out.println(season3);
		System.out.println(season3.getName());
		System.out.println(season3.getDuration());
		System.out.println(season3.getStartingMonth());
		
		Season season4 = spring.getBean("month3", Season.class);
		System.out.println(season4);
		System.out.println(season4.getName());
		System.out.println(season4.getDuration());
		System.out.println(season4.getStartingMonth());
		
		Season season5 = spring.getBean("month4", Season.class);
		System.out.println(season5);
		System.out.println(season5.getName());
		System.out.println(season5.getDuration());
		System.out.println(season5.getStartingMonth());
		
		Season season6 = spring.getBean("month5", Season.class);
		System.out.println(season6);
		System.out.println(season6.getName());
		System.out.println(season6.getDuration());
		System.out.println(season6.getStartingMonth());
		
	}

}
