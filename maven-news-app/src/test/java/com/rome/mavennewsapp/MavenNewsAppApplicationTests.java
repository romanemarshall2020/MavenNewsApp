package com.rome.mavennewsapp;


import com.rome.mavennewsapp.model.Article;
import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import com.rome.mavennewsapp.newsapi.request.EverythingRequest;
import com.rome.mavennewsapp.newsapi.response.NewsApiResponse;
import com.rome.mavennewsapp.repository.ArticleRepo;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.reactive.function.client.ClientResponse;
import resources.MysqlTestProfileJPAConfig;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = MavenNewsAppApplication.class)
public class MavenNewsAppApplicationTests {

	@Autowired
	private NewsApiIntegration integration;

	@Autowired
	private ArticleRepo articleRepo;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void returnEverything(){
//		ClientResponse mockResponse = mock
//		assertNull(expected);
//	}



}
