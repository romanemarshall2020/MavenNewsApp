package com.rome.mavennewsapp.newsapi;

import com.rome.mavennewsapp.model.Source;
import lombok.Data;

@Data
public class NewsApiArticle {
    private Source source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;
}
