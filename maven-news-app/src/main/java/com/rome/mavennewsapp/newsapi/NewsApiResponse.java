package com.rome.mavennewsapp.newsapi;

import lombok.Data;
import java.util.List;


@Data
public class NewsApiResponse {
    private String status;
    private String code;
    private String message;
    private int totalResults;
    private List<NewsApiArticle> articles ;
}
