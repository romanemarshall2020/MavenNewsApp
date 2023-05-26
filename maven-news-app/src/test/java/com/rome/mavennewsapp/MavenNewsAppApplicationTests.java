package com.rome.mavennewsapp;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.rome.mavennewsapp.model.article.Article;
import com.rome.mavennewsapp.model.requests.EverythingReq;
import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import com.rome.mavennewsapp.repository.ArticleRepo;
import com.rome.mavennewsapp.service.NewsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = MavenNewsAppApplication.class)
public class MavenNewsAppApplicationTests {

	@Autowired
	private NewsApiIntegration integration;

//	@Autowired
//	private ArticleRepo articleRepo;
	@Value(value="${local.server.port}")
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	private NewsService newsService;

	@Test
	void contextLoads() {
	}

	@Test
	public void returnArticles() throws JsonProcessingException {
		List<Article> list = newsService.getArticles(new EverythingReq("rome"));
		assertNotNull(list, "List Exist");
		assertFalse(list.isEmpty(), "List contains articles" );
		for (Article article : list
			 ) {
			String titles = article.getTitle();
			// test that title is present
			assertNotNull(titles, "Title is present");
			// test that title is not blank
			assertFalse(titles.isEmpty(), "Title is not empty");
		}
	}

//	@Test
//	public void


//	@Test
//	public void greetingShouldReturnDefaultMessage() throws Exception {
//		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
//				String.class))



}
