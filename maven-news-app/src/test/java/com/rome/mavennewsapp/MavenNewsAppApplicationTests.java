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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


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
		assertNotNull(list);
	}



}
