package com.rome.mavennewsapp;


import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import com.rome.mavennewsapp.repository.ArticleRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


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
