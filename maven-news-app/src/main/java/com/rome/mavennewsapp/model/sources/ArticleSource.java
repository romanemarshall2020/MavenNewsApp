package com.rome.mavennewsapp.model.sources;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class ArticleSource {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    String name;
}
