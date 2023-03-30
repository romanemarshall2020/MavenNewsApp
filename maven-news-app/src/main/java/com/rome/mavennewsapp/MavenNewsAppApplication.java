package com.rome.mavennewsapp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import com.rome.mavennewsapp.newsapi.request.EverythingRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenNewsAppApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(MavenNewsAppApplication.class, args);
 		NewsApiIntegration newsApiIntegration = new NewsApiIntegration();
 		System.out.println("your response " + newsApiIntegration.requestEverything());

	}

}
