package com.rome.mavennewsapp;

import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import com.rome.mavennewsapp.newsapi.request.EverythingRequest;
import org.junit.jupiter.api.Test;
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
		integration.requestEverything(req);



	}



}
