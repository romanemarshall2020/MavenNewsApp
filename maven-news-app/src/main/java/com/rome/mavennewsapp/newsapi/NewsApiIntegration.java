package com.rome.mavennewsapp.newsapi;

import com.rome.mavennewsapp.newsapi.request.EverythingRequest;
import com.rome.mavennewsapp.newsapi.response.NewsApiResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

// News Api client that connects to the api and matches m model objects to the json properties along with setting the api key.
@Component
public class NewsApiIntegration {
    public NewsApiResponse requestEverything(EverythingRequest req) {
//        RestTemplate restTemplate = new RestTemplate();
        return null;
    }



}

