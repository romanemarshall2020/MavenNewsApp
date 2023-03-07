package com.rome.mavennewsapp;


import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import com.rome.mavennewsapp.newsapi.request.EverythingRequest;
import com.rome.mavennewsapp.newsapi.response.NewsApiResponse;
import com.rome.mavennewsapp.repository.ArticleRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import resources.MysqlTestProfileJPAConfig;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = {
		MavenNewsAppApplication.class,
		MysqlTestProfileJPAConfig.class
})
@ActiveProfiles("test")
public class MavenNewsAppApplicationTests {

	@Autowired
	private NewsApiIntegration integration;

	@Autowired
	private ArticleRepo articleRepo;

	@Test
	void contextLoads() {
	}


	public void returnEverything(){
		NewsApiResponse expected = integration.requestEverything(null);
		assertNull(expected);
	}



}
