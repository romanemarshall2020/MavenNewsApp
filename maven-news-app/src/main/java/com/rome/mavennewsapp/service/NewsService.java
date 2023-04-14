package com.rome.mavennewsapp.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.rome.mavennewsapp.model.EverythingReq;
import com.rome.mavennewsapp.model.article.Article;
import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    NewsApiIntegration newsApiIntegration;
    public List<Article> getArticles() throws JsonProcessingException {
        List<Article> articleList = newsApiIntegration.requestEverything(new EverythingReq());
        return articleList;
    }
}
