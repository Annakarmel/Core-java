package com.xworkz.firstAid.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SpringConfiguration;
import com.xworkz.firstAid.dto.FirstAidDTO;
import com.xworkz.firstAid.service.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service = container.getBean(FirstAidService.class);
		
		boolean saved = service.validateAndSave(new FirstAidDTO());
		System.out.println("saved "+saved);
	}
}
