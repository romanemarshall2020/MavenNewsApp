package com.rome.mavennewsapp.newsapi.request;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import java.time.LocalDate;


@Data
public class EverythingRequest {
    @JsonIgnore
    private String apiKey;
    private String q;
    private String searchIn;
    private String sources;
    private String domains;
    private String excludeDomains;
    private LocalDate from;
    private LocalDate to;
    private String language;
    private String sortBy;
    private int pageSize;
    private int page;
}