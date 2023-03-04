package com.rome.mavennewsapp;


import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import com.rome.mavennewsapp.newsapi.request.EverythingRequest;
import com.rome.mavennewsapp.newsapi.response.NewsApiResponse;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MavenNewsAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void returnEverything(EverythingRequest req){
//		int pageRequest = req.getPage();
		NewsApiIntegration integration = new NewsApiIntegration();
		Object expectedReturn = integration.requestEverything(null);
		Object actualReturn = integration.requestEverything(req);
		integration.requestEverything(req).equals(expectedReturn);
		assert integration.requestEverything(req) == expectedReturn;

	}



}
