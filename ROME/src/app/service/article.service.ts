import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Article } from '../models/article';

@Injectable({
  providedIn: 'root'
})
export class ArticleService {

  articlesURL: string = "http://localhost:8080/home"

  constructor(private http: HttpClient) {
    this.findAll().subscribe
  }

  public findAll(): Observable<Article[]> {
    return this.http.get<Article[]>(this.articlesURL);
  }
}
