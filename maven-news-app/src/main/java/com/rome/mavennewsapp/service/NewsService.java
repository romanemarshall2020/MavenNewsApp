package com.rome.mavennewsapp.service;


import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    @Autowired
    NewsApiIntegration newsApiIntegration;

}
