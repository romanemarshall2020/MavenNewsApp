package com.rome.mavennewsapp.newsapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rome.mavennewsapp.model.article.Article;
import com.rome.mavennewsapp.model.sources.ArticleSource;
import com.rome.mavennewsapp.newsapi.request.EverythingRequest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

// News Api client that connects to the api and matches m model objects to the json properties along with setting the api key.
@Component
public class NewsApiIntegration {
    private static final ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    private static final RestTemplate restTemplate = new RestTemplate();
    public List<Article> requestEverything(EverythingRequest req) {
        List<Article> output = new ArrayList<>();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "ab3971f7a2af4190b5dced2f8d0e4719");
        ResponseEntity<Map<String,Object>> results = restTemplate.exchange("https://newsapi.org/v2/everything?q={q}&from={from]&to={to}&sortBy={sortBy}", HttpMethod.GET, new HttpEntity<>(headers), new ParameterizedTypeReference<>(){}, Map.of("q","java","from","2023-02-28","to","2023-02-28","sortBy","popularity"));

        if (results.getBody() != null && results.getBody().get("articles") != null && results.getBody().get("articles") instanceof List) {
            output = ((List<Object>)results.getBody().get("articles")).stream().map(article->mapper.convertValue(article, Article.class)).collect(Collectors.toList());
        }

        System.out.println(output);
        return output;
    }



}

