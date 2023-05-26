import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Article } from '../models/article';

@Injectable({
  providedIn: 'root'
})
export class ArticleService {
  searchUrl: string =  "http://localhost:8080/search?q=";
  articlesURL: string = "http://localhost:8080/home";
  techStories: string = "http://localhost:8080/tech";

  constructor(private http: HttpClient) {
    this.findAll().subscribe
    this.getTechStories().subscribe

  }

  public findAll(): Observable<Article[]> {
    // if(){
      return this.http.get<Article[]>(this.searchUrl + "apple");
    // }

  }

  public search(qTopic: string){

    return this.http.get<Article[]>(this.searchUrl + "Apple");
  }

  public getTechStories(): Observable<Article[]>{
    return this.http.get<Article[]>(this.techStories);
  }
}

