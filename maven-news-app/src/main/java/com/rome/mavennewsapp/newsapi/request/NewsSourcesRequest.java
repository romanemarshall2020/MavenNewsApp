package com.rome.mavennewsapp.newsapi.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NewsSourcesRequest {
    @JsonIgnore
    private String apiKey;

    @JsonProperty("category")
    private String category;

    @JsonProperty("language")
    private String language;

    @JsonProperty("country")
    private String country;

}
