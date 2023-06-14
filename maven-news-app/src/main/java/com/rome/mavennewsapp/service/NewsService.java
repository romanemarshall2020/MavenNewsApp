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
    private NewsApiIntegration newsApiIntegration;
    public List<Article> getArticles(EverythingReq req) throws JsonProcessingException {
//        String search = req.getQ();
        List<Article> articleList = newsApiIntegration.requestEverything(req);
        System.out.println("this is your request " + req);

        return articleList;
    }

//    public List<Article> getTopStories(){
//        EverythingReq req = new EverythingReq();
//
//        List<Article> topStories = newsApiIntegration.requestEverything(new EverythingReq(req.getQ()));
//        return topStories;
//    }

//    public List<Article> searchArticles() throws JsonProcessingException {
//        List<Article> articleList = newsApiIntegration.requestEverything();
//
//        return articleList;
//    }

}
