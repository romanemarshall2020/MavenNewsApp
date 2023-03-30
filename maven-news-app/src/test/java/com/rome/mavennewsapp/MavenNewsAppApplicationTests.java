package com.rome.mavennewsapp;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.rome.mavennewsapp.model.article.Article;
import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import com.rome.mavennewsapp.repository.ArticleRepo;
import com.rome.mavennewsapp.service.NewsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = MavenNewsAppApplication.class)
public class MavenNewsAppApplicationTests {

	@Autowired
	private NewsApiIntegration integration;

	@Autowired
	private ArticleRepo articleRepo;

	@Autowired
	private NewsService newsService;

	@Test
	void contextLoads() {
	}

	@Test
	public void returnArticles() throws JsonProcessingException {
		List<Article> list = newsService.getArticles();
		assertNotNull(list, "List Exist");

		assertTrue(!list.isEmpty(), "List contains articles" );

		for (Article article : list
			 ) {
			String titles = article.getTitle();
			// test that title is present
			assertNotNull(titles);
			// test that title is not blank


		}
		// get an article
		// use a for loop to go throw collection
		// check that each article has a title
	}



}
