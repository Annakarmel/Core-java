package com.xworkz.springFramework.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springFramework.browserBean.Chrome;
import com.xworkz.springFramework.browserBean.FireFox;
import com.xworkz.springFramework.configuration.BrowserConfiguration;

public class BrowserRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		FireFox fireFox = container.getBean(FireFox.class);
		fireFox.browse();
		
		Chrome chrome = container.getBean(Chrome.class);
		chrome.browse();
	}
}
