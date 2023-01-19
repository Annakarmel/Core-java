package com.xworkz.missile.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SpringConfiguration;
import com.xworkz.missile.dto.MissileDTO;
import com.xworkz.missile.service.MissileService;

public class MissileRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileService service = container.getBean(MissileService.class);
		
		boolean saved = service.validateAndSave(new MissileDTO());
		System.out.println("saved "+saved);
	}

}
