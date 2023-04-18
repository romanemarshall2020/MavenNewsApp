package com.rome.mavennewsapp.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.rome.mavennewsapp.model.requests.EverythingReq;
import com.rome.mavennewsapp.model.article.Article;
import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    NewsApiIntegration newsApiIntegration;
    public List<Article> getArticles(EverythingReq req) throws JsonProcessingException {
        //String search = req.getQ();
        List<Article> articleList = newsApiIntegration.requestEverything(req);

        return articleList;
    }

//    public List<Article> searchArticles() throws JsonProcessingException {
//        List<Article> articleList = newsApiIntegration.requestEverything();
//
//        return articleList;
//    }

}
