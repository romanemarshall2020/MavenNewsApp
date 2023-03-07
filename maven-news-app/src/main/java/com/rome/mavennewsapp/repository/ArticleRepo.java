package com.rome.mavennewsapp.repository;

import com.rome.mavennewsapp.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Long>, JpaSpecificationExecutor<Article> {

}
