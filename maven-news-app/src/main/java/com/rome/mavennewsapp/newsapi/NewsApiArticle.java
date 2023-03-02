package com.rome.mavennewsapp.newsapi;


import lombok.Data;

import java.util.List;


@Data
public class NewsApiArticle {
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;
}
