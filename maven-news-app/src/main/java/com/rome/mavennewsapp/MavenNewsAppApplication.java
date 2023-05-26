package com.rome.mavennewsapp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rome.mavennewsapp.model.article.Article;
import com.rome.mavennewsapp.model.requests.EverythingReq;
import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import com.rome.mavennewsapp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class MavenNewsAppApplication {



	public static void main(String[] args) throws JsonProcessingException {
//		NewsService newsService = new NewsService();
		SpringApplication.run(MavenNewsAppApplication.class, args);
// 		NewsApiIntegration newsApiIntegration = new NewsApiIntegration();
//		 newsApiIntegration.requestEverything(new EverythingReq());
// 		System.out.println("your response " + newsApiIntegration.requestEverything(new EverythingReq("microsoft")));
//		String q = "facebook";
//		EverythingReq req = new EverythingReq(q);
//		System.out.println("IN HERE");
//		System.out.println(req);
//		List<Article> results = newsService.getArticles(req);
//		System.out.println("Your results " + results);

	}

}
