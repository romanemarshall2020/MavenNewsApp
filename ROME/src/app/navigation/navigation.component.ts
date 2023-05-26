import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
// import { NgModule } from '@angular/forms';
import {NgForm} from '@angular/forms';
import { Article } from '../models/article';
import { ArticleService } from '../service/article.service';


@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.scss']
})
export class NavigationComponent implements OnInit {


  articles: Article[] | undefined

  constructor(private articleService: ArticleService) {FormsModule }

  ngOnInit(): void {
  }

  submitForm(){

let articles = this.articleService.findAll().subscribe(data=> {
  this.articles = data
})
return articles
  }

  onSubmit(search: NgForm) {

 }

}




