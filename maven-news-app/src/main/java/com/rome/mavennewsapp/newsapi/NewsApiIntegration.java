package com.rome.mavennewsapp.newsapi;

import com.rome.mavennewsapp.model.Article;
import com.rome.mavennewsapp.newsapi.request.EverythingRequest;
import com.rome.mavennewsapp.newsapi.request.NewsSourcesRequest;
import com.rome.mavennewsapp.newsapi.response.NewsApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

// News Api client that connects to the api and matches m model objects to the json properties along with setting the api key.
@Component
public class NewsApiIntegration {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    @GetMapping(value = "articles")
    public ResponseEntity<Object> getAll(){
        String uri = "https://newsapi.org/v2/everything?q&apiKey=ab3971f7a2af4190b5dced2f8d0e4719";
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Object> results = restTemplate.getForEntity(uri, Object.class);
        return results;
    }
    public NewsApiResponse requestEverything(EverythingRequest req) {

        RestTemplate restTemplate = new RestTemplate();
        return null;
    }



}

