package com.rome.mavennewsapp.newsapi.response;

import lombok.Data;

@Data
// NewsApi's Sources
public class NewsApiSource {
    Long id;
    String name;
    String description;
    String url;
    String category;
    String language;
    String country;
}
