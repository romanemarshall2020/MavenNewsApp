import { Component, OnInit } from '@angular/core';
import { Article } from '../models/article';
import { ArticleService } from '../service/article.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss']
})
export class HomepageComponent implements OnInit {

  articles: Article[] | undefined

  constructor(private articleService: ArticleService) { }

   imgSrcs = []
   myImgs = []



  ngOnInit(): void {
  this.postArticles()


  }

   postArticles = () => {


   let articles = this.articleService.findAll().subscribe(data=> {
      this.articles = data
    })

    return articles
    // console.log("my articles " + articles)
  }



}
