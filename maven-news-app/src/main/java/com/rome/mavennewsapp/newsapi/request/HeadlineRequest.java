package com.rome.mavennewsapp.newsapi.request;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class HeadlineRequest {
    @JsonIgnore
    private String apiKey;

    @JsonProperty("country")
    private String country;

    @JsonProperty("category")
    private String category;

    @JsonProperty("sources")
    private List<NewsSourcesRequest> sources;

    @JsonProperty("q")
    private String q;

    @JsonProperty("pageSize")
    private int pageSize;

    @JsonProperty("page")
    private int page;
}
