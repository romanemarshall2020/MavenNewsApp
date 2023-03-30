package com.rome.mavennewsapp.newsapi;

import com.fasterxml.jackson.core.JsonProcessingException;
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

// News Api client that connects to the api and matches m model objects to the json properties along with setting the api key.
@Component
public class NewsApiIntegration {
    public List<Article> requestEverything() throws JsonProcessingException {
        Map<String, Object> params = new HashMap<>();
        URI uri = URI.create("https://newsapi.org/v2/everything");
//        ObjectMapper mapper = new ObjectMapper();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-api-key", "ab3971f7a2af4190b5dced2f8d0e4719");
        RestTemplate restTemplate = new RestTemplate();

        // used to make uri with queryPara
        UriComponentsBuilder builder = UriComponentsBuilder.fromUri(uri)
            .queryParam("q", "Java")
            .queryParam("from", "2023-02-28")
            .queryParam("to", "2023-02-28")
            .queryParam("sortBy", "popularity")
            .queryParam("apiKey", "ab3971f7a2af4190b5dced2f8d0e4719");

//        System.out.println(builder.buildAndExpand(params).toUri());
        // Request Entity that contains header, our uri and our httpMethod
        RequestEntity<List<Object>> apiReq = new RequestEntity<>(headers, HttpMethod.GET, uri);

        // TypeReference of our Response
        ParameterizedTypeReference<Map<String, Object>> typeRef = new ParameterizedTypeReference<>() {};

//        using restTemplate method exchange to make our request and get back a response based no our uri params
        ResponseEntity<Map<String, Object>> results = restTemplate.exchange(builder.buildAndExpand(params).toUri(), HttpMethod.GET,apiReq, typeRef);

        // creates a variable that takes in an arrayList of Objects (Status, totalResults, and articles(An arrayList of articles)
        ArrayList<Object> apiArticles = (ArrayList<Object>) results.getBody().get("articles");

        // creates a variable that only contains the articles from our response object
        ArrayList<Article> articleList = new ArrayList<>();

        // for loop that loops through each article inside the articleList variable which is inside of apiArticles variable
        for (Object apiArticle : apiArticles){
           Article article = new Article();
           // also has a source variable to store or list of sources for each article
           ArticleSource source = new ArticleSource();

           Map<String, Object> temp = (Map<String, Object>) apiArticle;
           Map<String, String> apiSource = (Map<String, String>) temp.get("source");
           source.setId(apiSource.get("id"));
           source.setName(apiSource.get("name"));

//           setting our article
           article.setSource(source);
           article.setTitle((String) temp.get("title"));
           article.setAuthor((String) temp.get("author"));
           article.setDescription((String) temp.get("description"));
           article.setUrl((String) temp.get("url"));
           article.setUrlToImage((String) temp.get("urlToImage"));
           article.setContent((String) temp.get("content"));
           article.setPublishedAt((String) temp.get("publishedAt"));


           articleList.add(article);
        }

//        System.out.println("[result]: " + results.getBody().get("articles"));
//        System.out.println("[article]: " + article.get("title"));

//        System.out.println(articleList);
        return articleList;
    }



}

