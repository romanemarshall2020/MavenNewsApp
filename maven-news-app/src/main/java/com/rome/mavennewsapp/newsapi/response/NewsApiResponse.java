package com.rome.mavennewsapp.newsapi.response;

import lombok.Data;
import java.util.List;


@Data
public class NewsApiResponse {  // Response object for everything request.
    private String status;  // Also has status, code and message just incase of error
    private String code;
    private String message;
    private int totalResults;
    private List<NewsApiArticle> articles ;
}
