import { Component, OnInit } from '@angular/core';
import { Article } from '../models/article';
import { ArticleService } from '../service/article.service';

@Component({
  selector: 'app-techHeadlines',
  templateUrl: './techHeadlines.component.html',
  styleUrls: ['./techHeadlines.component.scss']
})
export class TechHeadlinesComponent implements OnInit {
  articles: Article[] | undefined

  constructor(private articleService: ArticleService) { }

  ngOnInit(): void {
   this.postArticles()
  }




postArticles = () => {


let articles = this.articleService.getTechStories().subscribe(data=> {
   this.articles = data
 })
 console.log("my articles " + articles)

 return articles
}

}
