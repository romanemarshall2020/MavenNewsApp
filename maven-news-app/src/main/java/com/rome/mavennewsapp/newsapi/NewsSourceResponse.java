package com.rome.mavennewsapp.newsapi;

import lombok.Data;

@Data
public class NewsSourceResponse {
    private String id;
    private String name;
    private String description;
    private String url;
    private String category;
    private String language;
    private String country;
}
