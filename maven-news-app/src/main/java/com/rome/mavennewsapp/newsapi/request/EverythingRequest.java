package com.rome.mavennewsapp.newsapi.request;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.LocalDate;


@Data
public class EverythingRequest {
    @JsonIgnore
    private String apiKey;

    @JsonProperty("q")
    private String q;

    @JsonProperty("searchIn")
    private String searchIn;

    @JsonProperty("sources")
    private String sources;

    @JsonProperty("domains")
    private String domains;

    @JsonProperty("excludeDomains")
    private String excludeDomains;

    @JsonProperty("from")
    private LocalDate from;

    @JsonProperty("to")
    private LocalDate to;

    @JsonProperty("language")
    private String language;

    @JsonProperty("sortBy")
    private String sortBy;

    @JsonProperty("pageSize")
    private int pageSize;

    @JsonProperty("page")
    private int page;
}
