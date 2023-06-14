package com.rome.mavennewsapp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rome.mavennewsapp.model.article.Article;
import com.rome.mavennewsapp.model.requests.EverythingReq;
import com.rome.mavennewsapp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NewsController {
    @Autowired
   private NewsService newsService;

    @GetMapping("/home")
//    public List<Article> searchArticles(@PathVariable("q") String q) throws JsonProcessingException {
    public List<Article> allArticles() throws JsonProcessingException {
        String q = "*";
        EverythingReq req = new EverythingReq(q);

        return newsService.getArticles(req);
    }

    @GetMapping("/search")
    public List<Article> searchArticles(@RequestParam("q")String search) throws JsonProcessingException {
        System.out.println("before if statement " + search);

//        if (search == null || search == "") {
//            search = "America";
//        }
        System.out.println("After if statement" + search);

        String q = search;
        EverythingReq req = new EverythingReq(q);
//        System.out.println("IN HERE");
        System.out.println(req);
        return newsService.getArticles(req);
    }
    @GetMapping("/tech")
//    public List<Article> searchArticles(@PathVariable("q") String q) throws JsonProcessingException {
    public List<Article> techArticles() throws JsonProcessingException {
            String q = "technology";
        EverythingReq req = new EverythingReq(q);
//        System.out.println(newsService.getArticles(req));
//        System.out.println(req);
        return newsService.getArticles(req);
    }



    public void setNewsService(NewsService newsService) {this.newsService = newsService;}
}


