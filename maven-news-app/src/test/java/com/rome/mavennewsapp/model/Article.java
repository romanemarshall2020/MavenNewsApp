package com.rome.mavennewsapp.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Source source;
    private String author;
    private String title;
}
