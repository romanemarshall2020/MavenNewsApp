package com.rome.mavennewsapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rome.mavennewsapp.model.article.Article;
import com.rome.mavennewsapp.model.requests.EverythingReq;
import com.rome.mavennewsapp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NewsController {
    @Autowired
    NewsService newsService;

    @GetMapping("/home")
    public List<Article> allArticles() throws JsonProcessingException {
        String q = "google";
        EverythingReq req = new EverythingReq(q);
        System.out.println("IN HERE");
        System.out.println(req);
        return newsService.getArticles(req);
    }

    public void setNewsService(NewsService newsService) {this.newsService = newsService;}
}


