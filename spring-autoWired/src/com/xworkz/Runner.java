package com.xworkz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.boot.Government;
import com.xworkz.boot.Hardware;
import com.xworkz.boot.Pencil;
import com.xworkz.boot.PersonalData;
import com.xworkz.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		String[] ref = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref));
		
		Hardware ref3 = spring.getBean(Hardware.class);
		System.out.println(ref3);
		
		Pencil ref5 = spring.getBean(Pencil.class);
		System.out.println(ref5);
		
		Government ref7 = spring.getBean(Government.class);
		System.out.println(ref7);
		
		PersonalData ref8 = spring.getBean(PersonalData.class);
		System.out.println(ref8);
	}
}
