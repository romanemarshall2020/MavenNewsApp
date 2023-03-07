package com.rome.mavennewsapp;

import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenNewsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenNewsAppApplication.class, args);
 		NewsApiIntegration newsApiIntegration = new NewsApiIntegration();
 		System.out.println("your response " + newsApiIntegration.getAll());

	}

}
