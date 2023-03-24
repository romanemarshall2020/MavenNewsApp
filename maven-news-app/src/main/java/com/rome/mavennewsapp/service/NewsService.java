package com.rome.mavennewsapp.service;


import com.rome.mavennewsapp.newsapi.NewsApiIntegration;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    NewsApiIntegration newsApiIntegration = new NewsApiIntegration();

}
