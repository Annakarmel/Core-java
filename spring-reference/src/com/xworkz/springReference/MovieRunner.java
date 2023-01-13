package com.xworkz.springReference;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.springReference.boot.movie.Movie;
import com.xworkz.springReference.boot.movie.producer.Producer;
import com.xworkz.springReference.configuration.MovieConfiguration;

public class MovieRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Movie movie = container.getBean(Movie.class);
		movie.checkDirectorRef();
		
		System.out.println("-----------------------------------------------------");
		
		Producer producer = container.getBean(Producer.class);
		producer.checkAssistantRef();
	}
}
