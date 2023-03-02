package com.rome.mavennewsapp.newsapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NewsSourcesRequest {
//    private String apiKey;
    @JsonProperty("category")
    private String category;

    @JsonProperty("language")
    private String language;

    @JsonProperty("country")
    private String country;

}
