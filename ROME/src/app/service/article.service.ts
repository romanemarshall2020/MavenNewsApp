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
    // calling search function but not sure how to give it a parameter so for now its an empty string
    this.search("").subscribe

  }

  public findAll(): Observable<Article[]> {
    // if(){
      return this.http.get<Article[]>(this.searchUrl + "*");
    // }

  }
 // service layer will get said topic to send back
  public search(qTopic: string){
    // may have to add more on to our http get method here. to handle async functionality. not sure yet
    return this.http.get<Article[]>(this.searchUrl + qTopic);
  }

  public getTechStories(): Observable<Article[]>{
    return this.http.get<Article[]>(this.techStories);
  }
}

