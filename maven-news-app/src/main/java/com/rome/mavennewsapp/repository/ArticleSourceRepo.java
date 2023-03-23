package com.rome.mavennewsapp.repository;

import com.rome.mavennewsapp.model.sources.ArticleSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ArticleSourceRepo extends JpaRepository<ArticleSource, Long>, JpaSpecificationExecutor<ArticleSource> {
}
