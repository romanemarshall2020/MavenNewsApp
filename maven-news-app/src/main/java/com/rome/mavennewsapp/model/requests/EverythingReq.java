package com.rome.mavennewsapp.model.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EverythingReq {
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


    public EverythingReq(String q){
        this.q = q;
    }

    public String getQ(){
        return this.q;
    }

}
