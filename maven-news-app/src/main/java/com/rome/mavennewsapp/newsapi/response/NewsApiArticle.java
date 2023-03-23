package com.rome.mavennewsapp.newsapi.response;


import com.rome.mavennewsapp.model.sources.ArticleSource;
import lombok.Data;

import java.util.List;

// this is a for receiving articles
@Data
public class NewsApiArticle {
    private List<ArticleSource> sources;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;
}
